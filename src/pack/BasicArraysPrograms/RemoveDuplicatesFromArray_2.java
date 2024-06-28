package pack.BasicArraysPrograms;

public class RemoveDuplicatesFromArray_2 {
	static int count=0;
	public static void main(String[] args) {
		
		int arr[]= {9,7,6,3,2,3,3,5,9,2};
		
		int arr1[]=removeDuplicates(arr);
		
		for(int i=0; i<arr1.length-count;i++) {
			System.out.println(arr1[i]);
		}
	}
	public static int[] removeDuplicates(int arr[]) {
		int len=arr.length-1; 
		for(int i=0; i<arr.length-count;i++) {
			
			for(int j=len-count; j>i; j--) {
				
				if(arr[i]==arr[j]) {
					
					arr[j]=arr[j+1];
					
					count++;
				}
			}
		}
		return arr;
		
	}

}
