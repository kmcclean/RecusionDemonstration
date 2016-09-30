package com.company;

public class Main {

    public static void main(String[] args) {
        int testNumber = 10;
        Integer result = fibNum(testNumber - 1);
        System.out.printf(result.toString());
    }

    private static int fibNum (int n){
        if (n < 2){
            return 1;
        }
        else{
            return fibNum(n -1) + fibNum(n - 2);
        }
    }
}
