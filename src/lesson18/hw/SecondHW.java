package lesson18.hw;

import java.util.HashMap;

public class SecondHW {

    public static void findException() throws NullPointerException {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.err.println("Ошибка - NullPointerException");
        }
    }
}
