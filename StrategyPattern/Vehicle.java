package Projects.DesignPatterns.StrategyPattern;

import Projects.DesignPatterns.StrategyPattern.Strategy.IDriveStrategy;

public class Vehicle {
    
    IDriveStrategy driveStrategy;

    public Vehicle(IDriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
