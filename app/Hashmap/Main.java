package app.Hashmap;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

    map.put(1, "Yacine");
    map.put(2, "Norhane");
    System.out.println(map);
    System.out.println(map.get(1));
    System.out.println(map.containsKey(1));
    System.out.println(map.containsValue("Norhane"));
    System.out.println(map.size());
    System.out.println(map.isEmpty());
    System.out.println(map.keySet());

    for (Integer cle : map.keySet()) {
      System.out.println(cle + " : " + map.get(cle));
    }
    map.remove(1);
    System.out.println(map);
  }
}
