// File: containers/SmallContainer.java
package containers;

public class SmallContainer extends Container {

    public SmallContainer() {
        super(2.59, 2.43, 6.06);
    }

    @Override
    public double getCost(double weight) {
        return weight <= 500 ? 1000 : 1200;
    }
}
