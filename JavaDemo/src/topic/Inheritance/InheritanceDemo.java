package topic.Inheritance;

/**
 * this class demo how to use inheritance class
 * the child class inherit (extend) parent class can overide the method from parent class and use call method in parent class
 * the child class only extend one class but can implement many interface
 * the parent class can prevent child class overide method by using key word final infront of method such as finalPrint
 */
public class InheritanceDemo {
    public static void main (String[] args){
        shape circle = new circle();
        shape square = new square();
        shape shape = new shape();
        circle.draw(); // run draw in circe class
        circle.erase(); // run erase method in shape class since cicle class do not have overide erase method

        square.draw();
        square.erase(); // run erase method in square class since square class have overide erase method

        shape.draw();
        shape.erase();

    }
}
