# Coffee_Machine_
Created program through tutorial on HyperSkill.com

This is a Java program for a simple coffee machine simulation. The program allows users to perform various actions such as buying coffee, filling the machine with resources, checking remaining resources, and taking out money.

## Usage

To run the program, follow these steps:

1. Clone the repository and navigate to the project directory.
2. Compile the Java file:
   ```
   javac CoffeeMachine.java
   ```
3. Run the compiled program:
   ```
   java CoffeeMachine
   ```

## Features

The coffee machine program supports the following actions:

- **Buy**: Allows the user to select a coffee option and deducts the required resources (water, milk, coffee beans, cups) from the machine. It also adds money to the machine based on the selected coffee type.
- **Fill**: Enables the user to add resources (water, milk, coffee beans, cups) to the machine.
- **Take**: Gives the user the option to collect the money accumulated in the machine.
- **Remaining**: Displays the current amount of each resource (water, milk, coffee beans, cups) and the total money in the machine.
- **Exit**: Terminates the program.

## Example

Here's an example interaction with the coffee machine program:

```
Write action (buy, fill, remaining, take, exit): buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2
I have enough resources, making you a coffee!
Write action (buy, fill, remaining, take): remaining

The coffee machine has:
400 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, remaining, take): exit
```

## Requirements

To compile and run the program, make sure you have Java installed on your system.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
