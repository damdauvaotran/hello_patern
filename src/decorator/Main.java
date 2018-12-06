package decorator;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        CondimentDecorator espressoAndMocha = new Mocha(espresso);

        System.out.println(espressoAndMocha.getDescription() + ": " + espressoAndMocha.cost());

    }
}
