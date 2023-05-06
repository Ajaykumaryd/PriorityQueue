package pQbasics;

import java.util.*;
public class Ksorted {
	
	public static void Ksorted(int arr[],int k ) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	int i = 0;
	for (i=0;i<k; i++){
		pq.add(arr[i]);
	}
	
	for(;i < arr.length; i++){
		arr[i - k] = pq.remove();
		pq.add(arr[i]);
	}
	
	for(int j = arr.length - k; j < arr.length; j++){
		arr[j] = pq.remove();
	}
	
}   	
	public static void main(String[] args) {
		int a[]= {2,4,1,9,6,8};
		Ksorted(a,3);
		
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ " ");	
		}

	}

}
