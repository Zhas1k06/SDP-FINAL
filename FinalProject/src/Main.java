import java.util.Random;
import java.util.Scanner;

import singleton.OrderManager;
import strategy.PaymentStrategy;
import strategy.CreditCardPaymentStrategy;
import strategy.KaspiBankPaymentStrategy;
import strategy.OrderPaymentContext;
import decorator.FoodItem;
import decorator.CheeseDecorator;
import decorator.VegetableDecorator;
import adapter.LegacyFoodOrderSystem;
import adapter.OnlineFoodOrder;
import adapter.OnlineFoodOrderAdapter;
import abstractfactory.foodfactories.BurgerFactory;
import abstractfactory.foodfactories.PizzaFactory;
import abstractfactory.AbstractFoodItem;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пункт 1: Регистрация нового клиента
        System.out.println("Хотите зарегистрироваться как новый клиент? (да/нет)");
        String customerName = "";
        if (scanner.next().equalsIgnoreCase("да")) {
            LegacyFoodOrderSystem legacyFoodOrderSystem = new LegacyFoodOrderSystem();
            System.out.println("Введите ваше имя:");
            customerName = scanner.next();
            legacyFoodOrderSystem.registerCustomer(customerName);
        }

        // Пункт 2: Выбор продукта и добавление декораторов
        System.out.println("Выберите продукт:");
        System.out.println("1. Бургер (1400tg)");
        System.out.println("2. Пицца (размеры: 1 - 25 см, 2 - 35 см, 3 - 45 см)");
        int foodChoice = scanner.nextInt();

        AbstractFoodItem abstractFoodItem;
        double basePrice;

        if (foodChoice == 1) {
            abstractFoodItem = new BurgerFactory().createFoodItem();
            basePrice = 1400;
        } else {
            abstractFoodItem = new PizzaFactory().createFoodItem();
            basePrice = 0; // базовая цена для пиццы
        }

        FoodItem foodItem = new FoodItemAdapter(abstractFoodItem);

        // Добавление декораторов
        System.out.println("Хотите добавить сыр? (да/нет)");
        if (scanner.next().equalsIgnoreCase("да")) {
            foodItem = new CheeseDecorator(foodItem);
        }

        System.out.println("Хотите добавить овощи? (да/нет)");
        if (scanner.next().equalsIgnoreCase("да")) {
            foodItem = new VegetableDecorator(foodItem);
        }

        // Пункт 3: Размещение заказа
        System.out.println("Введите количество:");
        int quantity = scanner.nextInt();

        double pizzaSizeMultiplier = 0;
        if (foodChoice == 2) {
            System.out.println("Выберите размер пиццы:");
            System.out.println("1. 25 см (2000tg)");
            System.out.println("2. 35 см (2500tg)");
            System.out.println("3. 45 см (3000tg)");
            int pizzaSize = scanner.nextInt();

            switch (pizzaSize) {
                case 1:
                    pizzaSizeMultiplier = 2000;
                    break;
                case 2:
                    pizzaSizeMultiplier = 2500;
                    break;
                case 3:
                    pizzaSizeMultiplier = 3000;
                    break;
            }
        }

        OnlineFoodOrder onlineFoodOrder = new OnlineFoodOrderAdapter(new LegacyFoodOrderSystem());

        onlineFoodOrder.addToCart(foodItem.getDescription(), quantity);

        if (foodChoice == 2) {
            onlineFoodOrder.addToCart("Размер пиццы: " + pizzaSizeMultiplier + "tg", quantity);
        }

        onlineFoodOrder.placeOrder();

        // Пункт 4: Выбор способа оплаты
        System.out.println("Выберите метод оплаты:");
        System.out.println("1. Кредитная карта");
        System.out.println("2. Каспи Банк");
        int paymentChoice = scanner.nextInt();

        PaymentStrategy paymentStrategy;
        if (paymentChoice == 1) {
            paymentStrategy = new CreditCardPaymentStrategy();
        } else {
            paymentStrategy = new KaspiBankPaymentStrategy();
        }

        OrderPaymentContext paymentContext = new OrderPaymentContext(paymentStrategy);

        // Вывод общей стоимости
        double totalPrice = (foodItem.getPrice() + basePrice + pizzaSizeMultiplier) * quantity;
        System.out.println(customerName + "Общая стоимость: " + totalPrice + "tg");

        // Пункт 5: Ввод адреса и отображение информации о курьере
        System.out.println("Введите адрес доставки:");
        String address = scanner.next();

        Random random = new Random();
        int courierPrice = random.nextInt(1001) + 1000; // Случайная цена курьера от 1000 до 2000
        System.out.println("Курьер доставит по адресу: " + address);
        System.out.println("Цена курьера: " + courierPrice + "tg");

        // Обновление общей стоимости с учетом цены курьера
        totalPrice += courierPrice;
        System.out.println("Общая стоимость с учетом доставки: " + totalPrice + "tg");

        scanner.close();
    }

    // Адаптер для преобразования AbstractFoodItem в FoodItem
    static class FoodItemAdapter implements FoodItem {
        private AbstractFoodItem abstractFoodItem;

        public FoodItemAdapter(AbstractFoodItem abstractFoodItem) {
            this.abstractFoodItem = abstractFoodItem;
        }

        @Override
        public String getDescription() {
            return abstractFoodItem.getDescription();
        }

        @Override
        public double getPrice() {
            return abstractFoodItem.getPrice();
        }
    }
}