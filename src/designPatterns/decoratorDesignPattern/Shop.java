package designPatterns.decoratorDesignPattern;

import designPatterns.decoratorDesignPattern.withDecoratorDesignPattern.BasePizza;
import designPatterns.decoratorDesignPattern.withDecoratorDesignPattern.ExtraCheese;
import designPatterns.decoratorDesignPattern.withDecoratorDesignPattern.ExtraChicken;
import designPatterns.decoratorDesignPattern.withDecoratorDesignPattern.Margarita;

public class Shop {
    public static void main(String[] args) {
        BasePizza basePizza=new Margarita();
        System.out.println("The cost of margarita Pizza is :"+ basePizza.cost());
        ExtraCheese extraCheese=new ExtraCheese(basePizza);
        System.out.println("The cost of margarita Pizza with extra cheese is :"+ extraCheese.cost());
        ExtraChicken extraChicken=new ExtraChicken(extraCheese);
        System.out.println("The cost of margarita Pizza with extra cheese and extra chicken is :"+ extraChicken.cost());

    }
}
