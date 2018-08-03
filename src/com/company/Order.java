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


    public static void sort(ArrayList<Integer> list) {
        sort(list, 0, list.size() - 1);
    }

    public static void sort(ArrayList<Integer> list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sort(list, from, right - 1);
            sort(list, right + 1, to);   
        }
    }


    public static void main(String[] args) {


    }

}