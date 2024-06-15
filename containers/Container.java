// File: containers/Container.java
package containers;

public abstract class Container {
    private double height;
    private double width;
    private double length;

    public Container(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double calculateVolume() {
        return height * width * length;
    }

    public void printContainerInfo() {
        System.out.println("Container Dimensions (m): " + height + "x" + width + "x" + length);
        System.out.println("Volume (m^3): " + calculateVolume());
    }

    public abstract double getCost(double weight);
}
