package com.alphacoder.alogorithm.util;

public class BinarySearch {
    private BinarySearch(){

    }

    /*
    This function returns the index position of the element to be searched in the given arr.
    If not found in the array, return -1.
    Assumption is that given array is sorted.
     */
    public static int binarySearch(int[] arr, int element){
        int count= -1;

        int first= 0;
        int last= arr.length-1;

        while(first<= last){
            int middle= (first+last)/2;

            if(arr[middle]== element){
                count= middle;
                break;
            }else if(arr[middle]< element){
                first= middle+1;
            }else if(arr[middle]> element){
                last= middle-1;
            }
        }
        return count;

    }
}
