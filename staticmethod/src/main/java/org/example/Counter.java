package org.example;

public class Counter {
    private  static int totalCount = 0;
    private static int instanceCount = 0;



    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Counter.totalCount = totalCount;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void setInstanceCount(int instanceCount) {
        Counter.instanceCount = instanceCount;
    }


    @Override
    public String toString() {
        return "Counter{}";
    }

    public static void incrementTotalCount(){
        totalCount++;
    }

    public static void incrementInstanceCount(){
        instanceCount++;
    }
}
