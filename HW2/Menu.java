package HW2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    
    public Map<Integer, String> menu = new HashMap<>();
    // private ArrayList<String> items = new ArrayList<String>() {};

    public void show() {
        System.out.println("Выберите пункт меню");
        for (Map.Entry<Integer, String> entry : menu.entrySet()) {
            System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
        }
    }
    
    public void createMenu(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            this.menu.put(i + 1, items.get(i));
        }
    }
    
    public String getValue(int key) {
        return this.menu.get(key);
    }

}
