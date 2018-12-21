package topic.Inheritance;

public class circle extends shape{
    void draw(){
        System.out.println("draw circle");

    }
    /* this code below  will error since the child class cannot override method with define final in parent class
    void print(){

    }
    */

}
