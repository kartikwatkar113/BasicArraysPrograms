package pack.BasicArraysPrograms;

public class CountFrequencyInArray_3 {

	public static void main(String[] args) {
		
		int arr[]= {9,3,2,3,3,5,9,2};
		
		freqCount(arr);
	}
	
	public static void freqCount(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=(i+1); j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1) {
				System.out.println("| "+arr[i]+" | number occurs in "+count+" times...");
			}
		}
	}
}
