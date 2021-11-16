package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class quest2main {
public static void main(String args[])
{
	List<quest2> list=new ArrayList<quest2>();
	list.add(new quest2(10000,"accepted"));
	list.add(new quest2(20000,"completed"));
	list.add(new quest2(33000,"accepted"));
	list.add(new quest2(90000,"canceled"));
	
	
	
Stream<quest2>filtered_data=list.stream().filter(p->p.getPrice()>10000);

filtered_data.forEach(quest2->System.out.println(quest2.getStatus()+" "+quest2.getPrice()));
//	list.forEach(p->{if(price>10000)System.out.println(p)});
	
		
	
//Stream<quest2>filtered_data1=list.stream().filter(s->s.getStatus());
}
}
