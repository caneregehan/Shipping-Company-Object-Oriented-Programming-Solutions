// File: Main.java
import items.Item;
import methods.Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculation calculation = new Calculation();

        Item laptop = new Item("Laptop", 60, 50, 50, 6.5);
        Item mouse = new Item("Mouse", 30, 30, 20, 0.2);
        Item desktop = new Item("Desktop", 100, 150, 50, 20);
        Item lcd = new Item("LCD Screen", 120, 140, 80, 2.6);

        calculation.addItem(laptop);
        calculation.addItem(mouse);
        calculation.addItem(desktop);
        calculation.addItem(lcd);

        System.out.println("Enter the order (e.g., 100 200 150 200 for 100 Laptops, 200 Mice, 150 Desktops, 200 LCD screens):");
        for (int i = 0; i < 4; i++) {
            calculation.addOrder(scanner.nextInt());
        }

        calculation.printOrder();
    }
}
