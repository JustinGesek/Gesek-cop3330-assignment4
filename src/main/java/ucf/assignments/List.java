package ucf.assignments;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import ucf.assignments.Item;

//    -title
//    -items
//    +List(title)
//    +display()
//    +setTitle()
//    +addItem()
//    +removeItem()
//    +getItem()
//    +delete()
//    +save()
//    +load()
//    +getTitle()
class List {
    private String title;
    public ArrayList< Item> items;

    public List(String title) {
        this.title = title;
        items = new ArrayList<Item>();
    }

    public String getTitle(){
        return title;
    }

    public void addItem(Item item) {
        items.add( item);
    }


    public Item getItem(String itemDesc)
    {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getDescription().equals(itemDesc) ){
                return items.get(i);
            }
        }

        return null;
    }

}
