package com.ankush.dsa;

public class SubArray {

    public static void subArray(int num[]){

        for (int i=0; i<num.length; i++){
            int start =i;
            for (int j=i; j< num.length; j++){
                int end =j;

                for (int k=start; k<=end; k++){

                    System.out.print(num[k]);
                }
                System.out.println();

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] ={3,5,6,7,8,9};

        subArray(num);

        System.out.print("=====================================");
    }
}
