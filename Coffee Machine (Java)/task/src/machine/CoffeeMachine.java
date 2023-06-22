package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static int cups = 9, coffeeBeans = 120, milk = 540 ,water = 400 ,money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water;
        int milk;
        int coffeeBeans;
        int cups;
        int money;
        int cupsNeeded;



        System.out.println("Write action (buy, fill, remaining, take, exit): ");
        String userAction = scanner.next();

         do{
            switch (userAction) {
                case "buy":
                    buy();
                    System.out.println("Write action (buy, fill, remaining, take): ");
                    userAction = scanner.next();
                    break;
                case "fill":
                    fill();
                    System.out.println("Write action (buy, fill, remaining, take): ");
                    userAction = scanner.next();
                    break;
                case "take":
                    takeMoney();
                    System.out.println("Write action (buy, fill, remaining, take): ");
                    userAction = scanner.next();
                    break;
                case "remaining":
                    printResources();
                    System.out.println("Write action (buy, fill, remaining, take): ");
                    userAction = scanner.next();
                    break;
                case "exit":
                    break;
                default:
                    break;
            }
        } while(!Objects.equals(userAction, "exit"));

    }


    public static void buy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino," +
                " back - to main menu: ");
        String selectedCoffee = scanner.next();
        int money = 0;


        switch (selectedCoffee) {
            case "1":
                if (CoffeeMachine.water >= 250 && CoffeeMachine.coffeeBeans >= 16) {
                    CoffeeMachine.water -= 250;
                    CoffeeMachine.coffeeBeans -= 16;
                    CoffeeMachine.money += 4;
                    CoffeeMachine.cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else if (CoffeeMachine.water < 250){
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (CoffeeMachine.coffeeBeans < 16) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else{
                    System.out.println("Sorry, not enough resources!");
                }
                break;
            case "2":
                if (CoffeeMachine.water >= 350 && CoffeeMachine.milk >= 75 && CoffeeMachine.coffeeBeans >= 20) {
                    CoffeeMachine.water -= 350;
                    CoffeeMachine.milk -=75;
                    CoffeeMachine.coffeeBeans -= 20;
                    CoffeeMachine.money += 7;
                    CoffeeMachine.cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else if (CoffeeMachine.water < 350){
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (CoffeeMachine.milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (CoffeeMachine.coffeeBeans < 20) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else{
                    System.out.println("Sorry, not enough resources!");
                }
                break;
            case "3":
                if (CoffeeMachine.water >= 200 && CoffeeMachine.milk >= 100 && CoffeeMachine.coffeeBeans >= 12) {
                    CoffeeMachine.water -= 200;
                    CoffeeMachine.milk -= 100;
                    CoffeeMachine.coffeeBeans -= 12;
                    CoffeeMachine.money += 6;
                    CoffeeMachine.cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else if (CoffeeMachine.water < 200){
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (CoffeeMachine.milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (CoffeeMachine.coffeeBeans < 12) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else{
                    System.out.println("Sorry, not enough resources!");
                }
                break;
            case "back":
                break;
        }
    }

    public static void fill() {
        // Request user input for the amount of resources to add
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water do you want to add: ");
        int waterAdd = scanner.nextInt();
        System.out.print("Write how many ml of milk do you want to add: ");
        int milkAdd = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        int coffeeBeansAdd = scanner.nextInt();
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        int cupsAdd = scanner.nextInt();

        // Add the specified amount of resources to the machine
        CoffeeMachine.water += waterAdd;
        CoffeeMachine.milk += milkAdd;
        CoffeeMachine.coffeeBeans += coffeeBeansAdd;
        CoffeeMachine.cups += cupsAdd;
    }

    public static void takeMoney(){
        System.out.println("I gave you $" + CoffeeMachine.money);
        CoffeeMachine.money -= CoffeeMachine.money;
    }

    public static void printResources(){
        System.out.printf("""

                        The coffee machine has:\s
                        %s ml of water\s
                        %s ml of milk
                        %s g of coffee beans\s
                        %s disposable cups\s
                        $%s of money\s
                        \s
                        """, CoffeeMachine.water,
                CoffeeMachine.milk,CoffeeMachine.coffeeBeans,CoffeeMachine.cups,CoffeeMachine.money);
    }
}
