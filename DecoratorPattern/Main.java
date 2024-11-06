package Projects.DesignPatterns.DecoratorPattern;

import Projects.DesignPatterns.DecoratorPattern.ToppingsDecorator.ExtraCheese;
import Projects.DesignPatterns.DecoratorPattern.ToppingsDecorator.Mushroom;

public class Main {

    public static void main(String[] args) {

        /*
         * This design pattern is used to avoid Class Explosion
         * 
         * Here we keep wrapping the base object with new and new feature to a
         * accomodate all permutation and combination
         */
        
        BasePizza p1 = new ExtraCheese(new PaneerPizza());
        System.out.println("paneer + extracheese: " + p1.cost());

        BasePizza p2 = new ExtraCheese(new Mushroom(new MagritaPizza()));
        System.out.println("magrita + extracheese + Musroom: " + p2.cost());
    }
    
}
