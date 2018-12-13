package topic.WrapperClass;

/**
 * Wrapper class use to wrap the primitive data to object.
 * It is useful in collection class
 * this class demo how to
 *      wrap primitive data to object
 *      get primitive data from object
 *      parse primitive data to object (in case the primitive data is not same type of object
 */
public class WrapperDemo {
    public static void main (String[] args){
        // primitive data

        byte b = 10;
        System.out.println("print primitive value " + b);

        // java class /object

        Byte myByte1 = Byte.valueOf(b); // wrap primitive type byre b to object myByte1
        byte byteValue1 = myByte1.byteValue(); // return primitive value of myByte1
        System.out.println("print value in object " + myByte1);

        //parse

        int parseInt = Integer.parseInt("2"); // check if 2 is an integer before assign 2 to parseInt. will throws error if 2 is not integer
        Integer wrapInteger = new Integer(2); // wrap value of primitive parseInt to object wrapInteger
        changeValue(parseInt);
        changeValue(wrapInteger);
        System.out.println(" the value does not change if passing to method by primitive type 2 = " + parseInt);

        System.out.println(" the value does not change value if passing by object = " + wrapInteger);



    }
    static void changeValue (int value) {
        value = value + 1;

    }
    static void changeValue (Integer value){
        value = 3;

    }

}
