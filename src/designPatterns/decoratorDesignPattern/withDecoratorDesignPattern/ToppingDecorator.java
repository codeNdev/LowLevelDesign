package designPatterns.decoratorDesignPattern.withDecoratorDesignPattern;

public abstract class ToppingDecorator implements BasePizza{
    // this IS-A Base Pizza
    BasePizza pizza; // this HAS-A Base Pizza
    public ToppingDecorator(BasePizza pizza){
        this.pizza=pizza;
    }
}
