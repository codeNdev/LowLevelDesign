package designPatterns.decoratorDesignPattern.withDecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost()+30;
    }
}
