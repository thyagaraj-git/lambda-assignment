package lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class quest6 {
public static void main(String args[])
{
	ArrayList<String> arr=new ArrayList<String>(Arrays.asList("string","function"));
	
	
	arr.replaceAll(a->a.toUpperCase());
	System.out.println(arr);
	
}
}
