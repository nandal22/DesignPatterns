package Projects.DesignPatterns.DecoratorPattern.ToppingsDecorator;

import Projects.DesignPatterns.DecoratorPattern.BasePizza;

public class Mushroom extends Toppings{

    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 20;
    }
    
}
