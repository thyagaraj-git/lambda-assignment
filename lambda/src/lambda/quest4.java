package lambda;

import java.util.ArrayList;

public class quest4 {
public static void main(String args[])
{
	ArrayList<String> str=new ArrayList<String>();
	str.add("mikel");
	str.add("suresh");
	str.add("rashid");
	str.add("dhoni");
	
//	str.removeIf(s->(s.length()%2!=0));
//	System.out.println("after removing odd lengthstrings"+s);
	
	str.stream().filter(s->s.length()%2!=0).forEach(s->System.out.println("after removing oddstring: "+s));
	
	
	
//	for(String i : str)
//	{
//		System.out.println("after removing odd lengthstrings"+str);
//	}
}


}
