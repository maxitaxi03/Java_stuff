package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println(addition(5,7));
        int arr[] = {4,6,7,3,9,2};
        System.out.println(largeNum(arr));
        System.out.println(arr.length);


        trial();
    }
    public static int addition(int a, int b){
        return a + b;

    }
    public static int largeNum(int arr[]){
        int largeNum = arr[0];
        //for(int i:arr)
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largeNum){
                largeNum = arr[i];
            }
        }
        return largeNum;
    }
    public static void trial(){
        String names[] = {"Mary", "Tom", "George", "Bob", "Mike"};
        for (String name : names) {
            if (name.equals("George")){
                break;
            }
            System.out.println(name);
        }
    }
}
