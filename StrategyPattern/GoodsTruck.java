package Projects.DesignPatterns.StrategyPattern;

import Projects.DesignPatterns.StrategyPattern.Strategy.NormalDrive;

public class GoodsTruck extends Vehicle {

    public GoodsTruck(){
        super (new NormalDrive());
    }
    
}
