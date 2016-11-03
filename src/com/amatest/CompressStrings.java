package com.amatest;

import java.util.HashMap;

/**
 * Created by sudheerp on 02/11/16.
 */
public class CompressStrings {

    public static void main(String[] args) {
        String str = "aaabbcc";
        String[] arr = str.split("");

        HashMap<String, Integer> hash = new HashMap();
        for (String key : arr) {
            int count = 1;
            if (hash.get(key) != null) {
                count = hash.get(key);
            }
            if (hash.containsKey(key))
                count++;
            hash.put(key, count);
        }
        System.out.println(hash.get("a"));
        System.out.println(hash.get("b"));
        System.out.println(hash.get("c"));
    }
}
