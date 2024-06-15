// File: containers/BigContainer.java
package containers;

public class BigContainer extends Container {

    public BigContainer() {
        super(2.59, 2.43, 12.01);
    }

    @Override
    public double getCost(double weight) {
        return 1800;
    }
}
