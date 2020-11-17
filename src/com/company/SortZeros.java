package com.company;

public class SortZeros{

    public static void main(String[] args) {
        int[] arr = {1,2,0,3,4,0,0,5,7,1};
        SortZeros sort = new SortZeros();
        arr = sort.sortZeros(arr);

        for(int i: arr) {
            System.out.print(" "+i);
        }
    }
    public int[] sortZeros(int[] nums) {
        int i=0 , j = nums.length-1;

        while(i<j) {
            while(nums[i]==0 && i<j) {
                i++;
            }
            while(nums[j]!=0 && j>i) {
                j--;
            }
            if(i<j) {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}
