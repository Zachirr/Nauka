package com.company;

public class Tabliczka
{
    public static void main(String[] args){
        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++) {
                System.out.printf("%3d ", y*x);
            }
            System.out.println();
        }
    }
}