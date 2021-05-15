package com.karmerdero;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> intArrayList = new MyList<>();
        intArrayList.add(5);
        intArrayList.add(8);
        intArrayList.add(2);
        intArrayList.add(11);

        System.out.println("Largest value: " + intArrayList.largest());
        System.out.println("Smallest value: " + intArrayList.smallest());

    }
}
