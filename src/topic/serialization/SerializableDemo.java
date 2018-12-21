package topic.serialization;

import java.io.*;

/**
 * this demonstrate how to serializable object into file then deserilize a file into object
 * object is an instance object Student which have first name, lastname, SSN, id
 * object which need to serializable (Student in this example)  have to implement interface java.io.serializable
 * demonstrate transient - will not be serialize and will return as 0 when deserialize
 */
public class SerializableDemo {
    public static void main (String[] args) {
        // create 2 student object
        Student student1 = new Student("Hieu", "Nguyen",123456789);  // note transient SSN will not be serialize - which identify in Student class
        Student student2 = new Student ("Victoria","Phan",111222333);

        // write 2 student as object into file
        serializeObjectIntoFile(student1, student2);

        //deserialize object from file and print out
        deserializeObjectFromFile();


    }

    private static void deserializeObjectFromFile() {
        try {
            Student s;
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            while(fileIn.available()>0){ // check if file is not end of file
                s = (Student) in.readObject();
                System.out.println("student first name " + s.fName);
                System.out.println("student last name " + s.lName);
                System.out.println("student SSN: " + s.SSN + " note that this is not serialize so it return 0");
            }
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serializeObjectIntoFile(Student student1, Student student2) {
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser"); // create FileOutputStream to handle write into file
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // create ObjectOutputStream to write object into file fileOut
            out.writeObject(student1);
            out.writeObject(student2);
            out.close();
            fileOut.close();
            System.out.println("successfully write object student 1 and student 2 into file student.ser in current folder");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
