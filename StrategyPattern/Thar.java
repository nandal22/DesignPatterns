package Projects.DesignPatterns.StrategyPattern;

import Projects.DesignPatterns.StrategyPattern.Strategy.OffRoadDrive;

public class Thar extends Vehicle{

    public Thar(){
        super (new OffRoadDrive());
    }
    
}
