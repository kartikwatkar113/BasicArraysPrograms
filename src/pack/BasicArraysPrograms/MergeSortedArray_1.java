package pack.BasicArraysPrograms;

public class MergeSortedArray_1 {

	public static void main(String x[]) {
		int arr[]= {1,3,6,8};
		int arr1[]= {2,4,5,7,9};
		
		int len=arr.length;//4
		int len1=arr1.length;
//		
//		int arr2[]=new int[len+len1];
		
		int arr2[]=mergeArray(arr,arr1,new int[len+len1],len,len1);
		System.out.println("Merged array and sorted array");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
	public static int[] mergeArray(int arr[],int arr1[],int arr2[],int len,int len1){
		int k=0;
		for(int i=0; i<arr2.length; i++) {
			if(i<len) {
				arr2[i]=arr[i];
			}
			else {
				arr2[i]=arr1[k++];
			}
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr2[i]<arr2[j]) {
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		return arr2;	
	}
	
}
