package _380_insert_delete_getrandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private final HashMap<Integer, Boolean> map = new HashMap<>();
    private final ArrayList<Integer> elements = new ArrayList<>();
    private final Random random = new Random();
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            map.put(val, true);
            return elements.add(val);
        }
    }
    
    public boolean remove(int val) {
        map.remove(val);
        return elements.remove(Integer.valueOf(val));
    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(elements.size());
        return elements.get(randomIndex);
    }
}