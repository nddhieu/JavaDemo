package topic.generic;

import java.util.ArrayList;

public class GenericArray <T> {
    ArrayList<T> arrayList = new ArrayList<>();

    void GenericArray(T element){
    arrayList.add(element) ;
    }
    void GenericArray(){

    }
    public void addElement (T element){
        arrayList.add(element);
    }

    public void printArrayList(GenericArray<T> elementList){
        for (int i = 0; i < elementList.arrayList.size(); i++){
            System.out.println(elementList.arrayList.get(i));
        }
    }
}
