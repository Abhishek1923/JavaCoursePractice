package com.company;

import java.util.Scanner;

public class DynamicArray {

    private int array[];
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    public void addElement(int a) {
        if (count == size) {
            growSize();
        }
        array[count] = a;
        count++;
    }

    public void growSize() {
        int temp[] = null;
        if (count == size){
            temp = new int[size * 2];
            for (int i = 0; i < size; i++){
                temp[i] = array[i];
            }
        }
        array = temp;
        size = size * 2;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i< da.size;i++){
            int a=scanner.nextInt();
            da.addElement(a);
        }

        System.out.println("Elements of the array:");
        for (int i = 0; i < da.size; i++){
            System.out.print(da.array[i] + " ");
        }
    }
}
