package com.company;

import java.util.Comparator;

/**
 * Created by sudheerp on 21/09/16.
 */
public class StringComparator implements Comparator<StringComparator>{

    private String name;
    private  int age;

      public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(StringComparator stringComparator){
        return  this.name.compareTo(stringComparator.name);
    }

    @Override
    public int compare(StringComparator o1, StringComparator o2) {
        return o1.age-o2.age;
    }
}
