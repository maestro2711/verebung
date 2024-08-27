package org.example;


import static org.example.Counter.incrementInstanceCount;
import static org.example.Counter.incrementTotalCount;

public class Main {
    public static void main(String[] args) {
   Counter counter =new Counter();
   //Counter.incrementInstanceCount();
   incrementInstanceCount();

   Counter counter2 = new Counter();

   //Counter.incrementInstanceCount();
   incrementInstanceCount();

        incrementInstanceCount();
        incrementInstanceCount();

        incrementTotalCount();
        incrementTotalCount();


        System.out.println("Total instanz ist " +counter.getInstanceCount());

        System.out.println("Total instanz ist " +counter2.getInstanceCount());

        Calculator  calculator = new Calculator();
        System.out.println(calculator.add(4,5));


    }


    }
