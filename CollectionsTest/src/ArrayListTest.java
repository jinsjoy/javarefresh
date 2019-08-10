import java.util.ArrayList;

public class ArrayListTest {
public static ArrayList<String> arr = new ArrayList<String>();
public static void main(String args[]) {
	arr.add("jins");
	arr.add("greeshma");
	
	for(int i =0;i<arr.size();i++) {
		System.out.println(arr.get(i));
	}
}
}
