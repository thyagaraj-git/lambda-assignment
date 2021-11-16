package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class quest3 {
public static void main(String args[])
{
	ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
	//consumer
	list.stream().forEach(n->System.out.println(n));
	System.out.println(".......................................");
	//predicate
	list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
	System.out.println(".......................................");
	//supplier
	System.out.println(list.stream().findFirst());
	
	System.out.println(".......................................");
	Function<Integer,String>getInt=t->t*9+" is the value";
	System.out.println(getInt.apply(9));
}
}
