package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println(addition(5,7));
        int[] arr = {4, 6, 7, 3, 9, 2};
        System.out.println(largeNumFor(arr));
        System.out.println(largeNumForEach(arr));
        System.out.println(arr.length);
        trial();
    }
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int largeNumForEach(int[] arr){
        int largeNum = arr[0];
        for (int i : arr) { // iterating over an array. i is the element in the array not a counter.
            if (i > largeNum) {
                largeNum = i;
            }
        }
        return largeNum;
    }
    public static int largeNumFor(int[] arr) {
        int largeNum = arr[0];
         for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largeNum) {
                largeNum = arr[i];
            }
        }
        return largeNum;
    }
    public static void trial(){
        String[] names = {"Mary", "Tom", "George", "Bob", "Mike"};
        for (String name : names) {
            if (name.equals("George")){
                break;
            }
            System.out.println(name);
        }
    }
}
