package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static junit.framework.TestCase.assertEquals;

public class OrderTest {
    Order listNumber;
    Random rand;
    ArrayList<Integer> list;

    @Test
    public void positiveNumbersArray() throws Exception {
        this.listNumber = new Order();
        this.rand = new Random();

        list = new ArrayList<>();
        for(int i = 0; i < 1000; i++)
            list.add( rand.nextInt(50) + 1);

        ArrayList<Integer> toSort = new ArrayList<Integer>(list);
        Collections.sort(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }

    @Test
    public void negativeNumbersArray() throws Exception {
        this.listNumber = new Order();
        this.rand = new Random();

         list = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++)
            list.add( (rand.nextInt(50) + 1)*-1);

        ArrayList<Integer> toSort = new ArrayList<Integer>(list);
        Collections.sort(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }

    @Test
    public void positiveAndNegativeNumbers(){

        this.listNumber = new Order();
        this.rand = new Random();

        list = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++)
            list.add( rand.nextInt(30 + 1 + 10) - 10 );

        ArrayList<Integer> toSort = new ArrayList<Integer>(list);
        Collections.sort(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }

    @Test
    public void emptyArray(){
        this.listNumber = new Order();
        list = new ArrayList<Integer>();
        ArrayList<Integer> toSort = new ArrayList<Integer>(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }

    @Test
    public void nullArray(){
        this.listNumber = new Order();
        ArrayList<Integer> toSort = null;
        assertEquals(null, toSort );
    }

    @Test
    public void arraySiezeOne(){
        this.listNumber = new Order();

        list = new ArrayList<>();
        list.add(1);
        ArrayList<Integer> toSort = new ArrayList<>(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }


    @Test
    public void isSorted(){
        this.listNumber = new Order();
        this.rand = new Random();

        list = new ArrayList<>();
        for(int i = 0; i < 1000; i++)
            list.add(i);

        ArrayList<Integer> toSort = new ArrayList<Integer>(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }

    @Test
    public void efficientMethod(){
        this.listNumber = new Order();
        this.rand = new Random();

        list = new ArrayList<>();
        for(int i = 0; i < 1000; i++)
            list.add( rand.nextInt(50) + 1);

        ArrayList<Integer> toSort = new ArrayList<Integer>(list);
        Collections.sort(list);
        listNumber.sort(toSort);
        assertEquals(list, toSort );
    }

}