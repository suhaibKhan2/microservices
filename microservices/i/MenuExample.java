package com.wipro.microservices.i;

import java.util.ArrayList;
import java.util.List;

// Interface for vegetarian menu
interface IVegetarianMenu {
    List<String> getVegetarianItems();
}

// Interface for non-vegetarian menu
interface INonVegetarianMenu {
    List<String> getNonVegetarianItems();
}

// Interface for drinks menu
interface IDrinkMenu {
    List<String> getDrinkItems();
}

// Class for vegetarian menu
class VegetarianMenu implements IVegetarianMenu {
    @Override
    public List<String> getVegetarianItems() {
        List<String> vegetarianItems = new ArrayList<>();
        vegetarianItems.add("Vegetable Curry");
        vegetarianItems.add("Paneer Tikka");
        vegetarianItems.add("Salad");
        return vegetarianItems;
    }
}

// Class for non-vegetarian menu
class NonVegetarianMenu implements INonVegetarianMenu {
    @Override
    public List<String> getNonVegetarianItems() {
        List<String> nonVegetarianItems = new ArrayList<>();
        nonVegetarianItems.add("Chicken Curry");
        nonVegetarianItems.add("Fish Fry");
        nonVegetarianItems.add("Mutton Biryani");
        return nonVegetarianItems;
    }
}

// Class for drinks menu
class DrinkMenu implements IDrinkMenu {
    @Override
    public List<String> getDrinkItems() {
        List<String> drinkItems = new ArrayList<>();
        drinkItems.add("Water");
        drinkItems.add("Soda");
        drinkItems.add("Juice");
        return drinkItems;
    }
}

public class MenuExample {

    // Function to display vegetarian menu items
    static void displayVegetarianMenu(IVegetarianMenu menu) {
        System.out.println("Vegetarian Menu:");
        for (String item : menu.getVegetarianItems()) {
            System.out.println("- " + item);
        }
    }

    // Function to display non-vegetarian menu items
    static void displayNonVegetarianMenu(INonVegetarianMenu menu) {
        System.out.println("Non-Vegetarian Menu:");
        for (String item : menu.getNonVegetarianItems()) {
            System.out.println("- " + item);
        }
    }

    // Function to display drink menu items
    static void displayDrinkMenu(IDrinkMenu menu) {
        System.out.println("Drink Menu:");
        for (String item : menu.getDrinkItems()) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        VegetarianMenu vegMenu = new VegetarianMenu();
        NonVegetarianMenu nonVegMenu = new NonVegetarianMenu();
        DrinkMenu drinkMenu = new DrinkMenu();

        // Display menus
        displayVegetarianMenu(vegMenu);
        displayNonVegetarianMenu(nonVegMenu);
        displayDrinkMenu(drinkMenu);
    }
}