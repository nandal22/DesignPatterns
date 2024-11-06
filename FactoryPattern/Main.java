package Projects.DesignPatterns.FactoryPattern;

public class Main {

    /*
     * When we need to create the objects conditionally
     */

     public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
     }
    
}
