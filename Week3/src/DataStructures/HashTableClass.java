package DataStructures;

import java.util.Hashtable;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer,Integer>ht=new Hashtable<>();
        ht.put(123,432);
        ht.put(12,2345);
        ht.put(123,5623);
        ht.put(123,321);

        ht.remove(12);
        System.out.println(ht);
    }

}

