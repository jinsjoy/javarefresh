import java.util.Scanner;

public class BinarySearch {
	
	public void enterArray(String[] nameArray) {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<nameArray.length;i++) {
			nameArray[i] = s.nextLine();
		}
	}
	
	public int findString(String[] nameArray, int l, int r, String findString) {
			int mid = (l+(r-1))/2;
			if(nameArray[mid].equals(findString)) {
				return mid;
			}
			else if(nameArray[mid].compareTo(findString) < 0) {
				l = mid +1;
				
			} else if(nameArray[mid].compareTo(findString) > 0)  {
				r = mid -1;
			}
			return findString(nameArray, l ,r ,findString);
			
	}
	

	public static void main(String args[]) {
		String[] nameArray = new String[5];
		BinarySearch bs = new BinarySearch();
		bs.enterArray(nameArray);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String to search");
		String searchString = s.nextLine();
		int elementIndex = bs.findString(nameArray, 0, nameArray.length, searchString);
		System.out.println(nameArray[elementIndex]);
		
	}
}
