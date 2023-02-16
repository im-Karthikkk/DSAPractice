/*
You are given two sorted arrays, A and B, where A has a large enough buffer at the end to
hold B. Write a method to merge B into A in sorted order.
*/
import java.util.*;
class Merge{
	static void merge(int[] arr, int mid){
        int s = 0;
		int e = arr.length-1;
        int n1 = mid-s+1;
        int n2 = e - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int index = s;
        for(int i=0; i<n1; i++)
            arr1[i] = arr[index++];
        index = mid+1; 
        for(int i=0;i<n2; i++)
            arr2[i] = arr[index++];
        int ind1 = 0;
        int ind2 = 0;
        int arrInd = s;

        while(ind1 < arr1.length && ind2 < arr2.length){
            if(arr1[ind1]<arr2[ind2]){
                arr[arrInd++] = arr1[ind1++];
            }
            else
                arr[arrInd++] = arr2[ind2++];
        } 
        while(ind1 < arr1.length){
            arr[arrInd++] = arr1[ind1++];
        }
        while(ind2 < arr2.length)
            arr[arrInd++] = arr2[ind2++];
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of arr1: ");
		int n1 = sc.nextInt();
		System.out.println("Size of arr2: ");
		int n2 = sc.nextInt();
		int[] arr = new int[n1+n2];
		for(int i=0; i<n1; i++)
			arr[i] = sc.nextInt();
		for(int i = n1; i<n1+n2; i++)
			arr[i] = sc.nextInt();
		merge(arr, n1-1);
		for(int i: arr)
			System.out.print(i+" ");
	}
}