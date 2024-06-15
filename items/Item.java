// File: items/Item.java
package items;

public class Item {
    private String name;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Item(String name, double length, double width, double height, double weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double calculateVolume() {
        return length * width * height / 1000000; // converting cm^3 to m^3
    }

    public double getWeight() {
        return weight;
    }

    public void printItemInfo() {
        System.out.println("Item: " + name);
        System.out.println("Dimensions (cm): " + length + "x" + width + "x" + height);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Volume (m^3): " + calculateVolume());
    }
}
