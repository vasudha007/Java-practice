package demo.collections.generics.list;

import java.util.*;

public class Employee  {
    public static void main(String[] args) {


        // BEFORE JAVA 8
         List<Integer> list = new ArrayList<>();
        // array of size 10 is created initially

        //. AFter Java 8

       // List<Integer> list = new ArrayList<>();
        // array of size 0 is created
        // when we insert 1 element , array of size 10 is created.
        // lazy initialization of arraylist

        // before adding element in arraylist , its capacity is checked
        // if it is full , n + n/2 +1 , new size of arraylist if calculated
        // 16
        // capacity = 10
        // 10 + 10/2 +1 =  10 + 5 + 1 = 16

        // The elements from the old array will be copied to the new array


        //Linkedlist
        // 1, single      2. doubly linkedlist
















        //Parent                  child
     /* List<Integer> list = new LinkedList<>();
      list.add(101);
      list.add(220);
      list.add(3426);
      list.add(213213);*/

      LinkedList<Integer> list2 = new LinkedList<>();

      int arr[] = new int[5];


      // Arraylist --- backed by array [size = array]
        // size can grow dynamically

       /*

       Iterable
            |
       Collection
            |
         List
           |
       AbstractList
           |
         ArrayList




        */


    }
}
