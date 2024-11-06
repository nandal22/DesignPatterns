package Projects.DesignPatterns.DecoratorPattern.ToppingsDecorator;

import Projects.DesignPatterns.DecoratorPattern.BasePizza;

public class ExtraCheese extends Toppings {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 10;
    }
    
}
