package pack.BasicArraysPrograms;

import java.util.HashMap;

public class TwoSum_4 {

	public static void main(String[] args) {
		
		int arr[]= {2,7,11,15};
		
		int res[]=twoSumArray(arr,9);
		

			System.out.println("["+res[0]+" , "+res[1]+"]");
	}

	public static int[] twoSumArray(int arr[],int target) {
		
		int res[]=new int[2];
		
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		
		for(int i=0; i<arr.length; i++) {
			int diff=target-arr[i]; //9-2=7
			System.out.println(diff);
			if(m.containsKey(diff)) {
//				System.out.println("\n\n"+i);
//				System.out.println(m.get(diff));
				res[0]=m.get(diff);
				res[1]=i;
			}
			m.put(arr[i], i);//2   0
		}
		return res;
	}
}
