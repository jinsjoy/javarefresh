
public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		int length = arr.length;
	    int temp;
	    int lpi =0,lpo =0;
	    for(int i=0;i<length;i++) {
	    	for(int j = i+1;j<length;j++) {
	    		if(arr[i] > arr[j]) {
	    		temp = arr[i];
	    		arr[i]= arr[j];
	    		arr[j] = temp;
	    		lpi++;
	    		}
	    		lpo++;
	    	}
	    }
	    
	    for(int k =0; k < length; k++) {
	    System.out.println(arr[k]);	
	    }
	    System.out.println(lpi + " "+ lpo);	
	}
	
	public static void main(String args[]) {
		int arr[] = {1,7,2,8,3,4};
		bubbleSort(arr);
		
	}
	
	

}
