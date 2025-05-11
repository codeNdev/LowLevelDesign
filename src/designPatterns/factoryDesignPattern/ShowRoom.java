package designPatterns.factoryDesignPattern;

import designPatterns.factoryDesignPattern.withFactoryDesignPattern.Shape;
import designPatterns.factoryDesignPattern.withFactoryDesignPattern.ShapeFactory;

public class ShowRoom {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape obj=shapeFactory.getShape("CIRCLE");
        obj.draw();
        Shape obj2=shapeFactory.getShape("Rectangle");
        obj2.draw();
    }
}
