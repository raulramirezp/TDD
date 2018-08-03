package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Order {

    public void print(ArrayList<Integer> list){
        System.out.println();
        for (Integer element: list
                ) {
            System.out.print(element);
            System.out.print(" , ");
        }
        System.out.println();
    }


    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> toSort) {
       if( toSort == null)
           return null;
        int tmp = 0;
        for (int i = 0; i < toSort.size(); i++)
            for (int j = 0; j < toSort.size() - 1; j++) {
                if (toSort.get(j) > toSort.get(j + 1)) {
                    tmp = toSort.get(j + 1);
                    toSort.set(j + 1, toSort.get(j));
                    toSort.set(j, tmp);
                }

            }
        return toSort;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        return sortedList;
    }

    public static void main(String[] args) {


    }

}