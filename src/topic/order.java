package topic;

import object.boilSeafood;
import function.*;
import java.util.ArrayList;

import java.util.ArrayList;

// This demo how to initial constructor. object boilSeafood has initial constructor for set up value name, sauce and addon item
// over loading constructor. object boilseafood can initial by passing all value name, sauce, and addon item, or it can initial by passing only name
public class order {
    public void addItemBoilSeafood(String boilSFName) {
//        ArrayList<String> addonItem= new ArrayList<>();
//        addonItem.add("sweet corn");
        boilSeafood boilSeafood1 = new boilSeafood(boilSFName);
        PrintOrder.printBoilSeafoodItem(boilSeafood1);


    }


}
