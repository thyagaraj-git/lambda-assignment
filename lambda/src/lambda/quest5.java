package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class quest5 {
public static void main(String args[])
{
	ArrayList<String> str=new ArrayList<String>(Arrays.asList("java","mongodb","springs"));
	
	str.stream().map(a->a.toCharArray()[0]).forEach(a->System.out.print(a));
	
	
}
}
