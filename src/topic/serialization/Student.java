package topic.serialization;

import java.io.Serializable;

public class Student implements Serializable { // the object serializable have to implement java.io.Serializable
    String fName;
    String lName;
    transient int SSN; // transient SSN will not be serialize
    int id;
    static int numberOfStudent;

    public  Student(String fname, String lName, int SSN){
        this.fName = fname;
        this.lName = lName;
        this.SSN = SSN;
        this.id = numberOfStudent++;
    }
}
