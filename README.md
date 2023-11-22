
<p align="center">
  <img src="https://github.com/Zhas1k06/SDP-FINAL/blob/main/aitu.png" alt="logo">
</p>

# Online Fast-Food Ordering System

## Final Project for "Software Design Patterns" Course - SE-2226

### Team Members
- Tleubergenov Dauren
- Abil Zhasulan
- Turganbay Mynzhigit

### Teaching Assistant
Arailym Bakenova

### Project Overview

#### Idea
To create an online food ordering application that prioritizes ease of use and functionality. The application allows users to select products, add them to their cart, choose a payment method, and place orders.

#### Purpose
Develop an application meeting the following requirements:
- Ease of use
- Functionality
- Compatibility with various platforms

#### Objects of Work
- User
- Product
- Payment method
- Order

The user can select products from the catalog, add them to the cart, and choose a payment method. The application supports various payment methods, including credit cards and Kaspi Bank. After placing an order, the user receives order confirmation and delivery information.

#### Features Implemented
The provided code implements several key functions:
- New client registration
- Product selection
- Adding decorators to a product
- Placing an order
- Selecting a payment method
- Entering a delivery address
- Calculating the total cost of the order

#### Design Patterns Used
The code utilizes the following design patterns:
- Abstract Factory: For creating various product types
- Adapter: Converting AbstractFoodItem objects to FoodItem objects
- Strategy: To select a payment method

The abstract factory is used to create products of different types. The adapter is used to convert AbstractFoodItem objects to FoodItem objects. The strategy is used to select a payment method.

#### Potential Improvements
The code could be enhanced by implementing:
- Ability to choose delivery on a specific day and time
- Tracking order status
- Capability for users to leave reviews for orders

### UML Diagram
![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/Снимок%20экрана%202023-11-22%20в%2018.10.46.png?raw=true)

### GitHub Repository
[GitHub Repository Link](https://github.com/Zhas1k06/SDP-FINAL.git)

### Main body
New client registration
This feature allows the user to register in the system by entering their name. If the user is already registered, the system skips this step.

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/IMAGE%202023-11-22%2007:31:50.jpg)


### Product selection

This feature allows the user to select a product from a list. There are two products available: burger and pizza.
![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/IMAGE%202023-11-22%2007:31:51.jpg)


### Adding Decorators

This feature allows the user to add decorators to the selected product. There are two decorators available: cheese and vegetables.

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/4.png)

Placing an order

This feature allows the user to reference an order. The user must indicate the number of products and the size of the pizza (if pizza is selected).

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/IMAGE%202023-11-22%2007:31:47.jpg)

Selecting a payment method
This feature allows the user to select a payment method. Two payment methods are available: credit card and Kaspi Bank.

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/IMAGE%202023-11-22%2007:31:55.jpg)

Entering an address and using courier information
This feature allows the user to enter a shipping address. The system also displays courier information, including delivery costs.

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/IMAGE%202023-11-22%2007:31:56.jpg)

Calculation of the total cost of the order
This function determines the cost of the order, including the cost of production, delivery and payment.

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/IMAGE%202023-11-22%2007:31:57.jpg)

### Example Output
An example output demonstrates a user named Ivan registering, selecting items, adding decorators, specifying order details, and determining the total cost.

![Link to UML Diagram](https://github.com/Zhas1k06/SDP-FINAL/blob/main/console.png)

As can be seen from the output, the user registered in the system under the name Ivan, selected a burger, added cheese and vegetables to it, ordered two burgers, selected a pizza size of 25 cm and indicated the delivery address. The total cost of the order was 5600 tenge, including 1000 tenge for delivery..




### Conclusion

#### Key Points
- Successful implementation of an online food ordering application
- Usage of Abstract Factory, Decorator, Strategy, and Adapter design patterns

#### Project Outcomes
- Application successfully implements all required features
- Easy to use and understand
- Well-organized and modular

#### Challenges Faced
Implementing the decorator pattern posed a significant challenge initially.

#### Insights Gained
- Abstract factory pattern's power for creating diverse products
- Flexibility of decorator pattern for additional features
- Usefulness of strategy pattern for decoupling behavior implementation
- Adapter pattern's role in interface conversion

#### Future Improvements
- Additional features like order tracking and review functionality
- Refactoring for improved efficiency and easier maintenance

### Specific Insights for Provided Code
- Well-organized and correct use of design patterns
- Efficient and maintainable implementation of decorator and adapter patterns
- Suggested improvements include adding unit tests and a logging system

Conclusion
- The project was a success and the application met all of the requirements. The project also provided valuable insights into the use of design patterns.
- Specific insights for the code you provided
- The code you provided is well-organized and uses the design patterns correctly. The decorator pattern is implemented in a way that is efficient and easy to maintain. The adapter pattern is also implemented correctly, and it allows the application to use the legacy food order system without having to modify the code of the legacy system.
- One potential improvement to the code would be to add unit tests. Unit tests would help to ensure that the code is working correctly and that it is easy to maintain.
- Another potential improvement would be to add a logging system. A logging system would help to track errors and performance problems.


### References
- [Visual Paradigm](https://www.visual-paradigm.com/support/)
- [design pattern](https://refactoring.guru/ru/design-patterns/java)
