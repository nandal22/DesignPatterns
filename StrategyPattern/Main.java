package Projects.DesignPatterns.StrategyPattern;

public class Main {

    public static void main(String[] args){
        String def = "When child classes starts having common capbailities and they are unable to use the " +
            "parent class capabilty, we use this pattern";

        System.out.println(def);

        Vehicle veh = new Thar();
        veh.drive();
            
    }
    
}
