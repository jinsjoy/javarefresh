import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int arr[], int start, int end) {
		int pIndex = 0;
		int pivot = arr[end];
		int temp;
		for(int i=0;i<end;i++) {
			if(arr[i]<pivot) {
			temp = arr[i];
			arr[i] = arr[pIndex];
			arr[pIndex] = temp;
		    pIndex++;
			}
			
		}
		temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		return pIndex;
	}
	
	public static void quickSort(int integerArray[], int start , int end)
	{
		if(start < end) {
		int pIndex = partition(integerArray,start,end);
		quickSort(integerArray,start, pIndex - 1);
		quickSort(integerArray, pIndex+1, end);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Enter Array");
		int[] integerArray = new int[8];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<integerArray.length;i++) {
			integerArray[i] = s.nextInt();
		}
		quickSort(integerArray, 0, 7);
		
		for(int i=0;i<integerArray.length;i++) {
			System.out.println(integerArray[i]);
		}
		
	}

}
