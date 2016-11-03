package com.company;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sudheerp on 10/08/16.
 */
public class Main1 {


    public static void main(String args[]){
        System.out.println("Available processors (cores): " +
                Runtime.getRuntime().availableProcessors());

        System.out.println("Free memory in bytes  :  "+Runtime.getRuntime().freeMemory());
        //total memory available for JVM
        System.out.println("total memory available for JVM : "+Runtime.getRuntime().totalMemory());

        //Get a list of all fileSystem roots on this system

        //File[] roots=File.listRoots();
        System.out.println("Heapmemory : "+ ManagementFactory.getMemoryMXBean().getHeapMemoryUsage());
        System.out.println(System.getProperties());

    }
}

