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
[Link to UML Diagram](link_to_your_image)

### GitHub Repository
[GitHub Repository Link](https://github.com/Zhas1k06/SDP-FINAL.git)

### Example Output
An example output demonstrates a user named Ivan registering, selecting items, adding decorators, specifying order details, and determining the total cost.

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

### References
- [Visual Paradigm](https://www.visual-paradigm.com/support/)
