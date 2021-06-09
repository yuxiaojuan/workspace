package com.yusj.firstLearning.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] list = {2,4,6,3};
        sort(list,0,list.length - 1);
        System.out.println(Arrays.toString(list));
    }

    public static void sort(int[] list,int start,int end){
        if (start >= end) return;
        int j = compare(list,start,end);
        sort(list,start,j - 1);
        sort(list,j+1,end);
    }

    public static int compare(int[] list,int start,int end){
        int result = list[start];
        int i = start - 1;
        int j = end + 1;
        while(i >= j){
            while (list[++i]<result){
                 if (i >= end) break;
            }
            while (list[--j]>result){
                if (j <= start) break;
            }
            if(i < j){
                swap(list,i,j);
            }
        }
        return j;
    }

    private static void swap(int[] list,int a,int b){
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
}
