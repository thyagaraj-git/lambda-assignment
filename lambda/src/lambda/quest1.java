package lambda;


interface arithmetic{
	int ar(int a,int b);
}
public class quest1 {
public static void main(String args[])
{
	arithmetic add=(a,b)->(a+b);
	System.out.println("addition"+add.ar(20,10));
	
	arithmetic sub=(a,b)->(a-b);
	System.out.println("subtraction"+sub.ar(20,10));
	
	arithmetic multiply=(a,b)->(a*b);
	System.out.println("multiple"+multiply.ar(20,10));
	
	arithmetic devide=(a,b)->(a/b);
	System.out.println("devided"+devide.ar(20,10));
}
}
