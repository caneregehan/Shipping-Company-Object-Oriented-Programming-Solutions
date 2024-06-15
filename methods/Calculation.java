// File: methods/Calculation.java
package methods;

import items.Item;
import containers.SmallContainer;
import containers.BigContainer;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    private List<Item> items;
    private List<Integer> order;

    public Calculation() {
        this.items = new ArrayList<>();
        this.order = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addOrder(int quantity) {
        order.add(quantity);
    }

    public double totalVolume() {
        double totalVolume = 0;
        for (int i = 0; i < items.size(); i++) {
            totalVolume += items.get(i).calculateVolume() * order.get(i);
        }
        return totalVolume;
    }

    public double totalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).getWeight() * order.get(i);
        }
        return totalWeight;
    }

    public String bestShipping() {
        double totalVolume = totalVolume();
        double totalWeight = totalWeight();

        BigContainer bigContainer = new BigContainer();
        SmallContainer smallContainer = new SmallContainer();

        double bigVolume = bigContainer.calculateVolume();
        double smallVolume = smallContainer.calculateVolume();

        int bigContainersNeeded = (int) Math.floor(totalVolume / bigVolume);
        double remainingVolume = totalVolume - (bigContainersNeeded * bigVolume);
        int smallContainersNeeded = (int) Math.ceil(remainingVolume / smallVolume);

        double bigContainerCost = bigContainersNeeded * bigContainer.getCost(totalWeight);
        double smallContainerCost = smallContainersNeeded * smallContainer.getCost(totalWeight);
        double totalCost = bigContainerCost + smallContainerCost;

        return bigContainersNeeded + " big container(s) and " + smallContainersNeeded + " small container(s) with total cost: " + totalCost + " Euro";
    }

    public void printItems() {
        for (Item item : items) {
            item.printItemInfo();
            System.out.println();
        }
    }

    public void printOrder() {
        System.out.println("Order Information:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(order.get(i) + " x " + items.get(i).getName());
        }
        System.out.println("Total Volume: " + totalVolume() + " m^3");
        System.out.println("Total Weight: " + totalWeight() + " kg");
        System.out.println("Best Shipping Method: " + bestShipping());
    }
}
