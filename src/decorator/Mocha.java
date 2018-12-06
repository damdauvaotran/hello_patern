package decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + this.description;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
