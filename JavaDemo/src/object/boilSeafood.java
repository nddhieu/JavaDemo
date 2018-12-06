package object;

import java.util.ArrayList;

public class boilSeafood {
    String name;
    String sauce;
    ArrayList<String> addonItem = new ArrayList<String>();

    //constructor
    public boilSeafood(String name, String sauce, ArrayList<String> addonItem){
        this.name = name;
        this.sauce = sauce;
        this.addonItem = addonItem;
    }
    public boilSeafood(String name){ //over loading constructor
        this.name = name;
        this.sauce = "no sauce";
        this.addonItem = null;

    }

    public void setAddonItem(ArrayList<String> addonItem) {
        this.addonItem = addonItem;
    }
    public void addAddonItem(String newAddItem){
        this.addonItem.add(newAddItem);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getAddonItem() {
        return addonItem;
    }
}
