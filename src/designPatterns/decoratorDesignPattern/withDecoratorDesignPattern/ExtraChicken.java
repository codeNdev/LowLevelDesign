package designPatterns.decoratorDesignPattern.withDecoratorDesignPattern;

public class ExtraChicken extends ToppingDecorator{
    public ExtraChicken(BasePizza pizza) {
        super(pizza);
    }

    /**
     * @return
     */
    @Override
    public int cost() {
        return pizza.cost()+70;
    }
}
