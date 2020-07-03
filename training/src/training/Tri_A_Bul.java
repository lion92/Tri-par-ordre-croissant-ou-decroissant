package training;

import java.util.ArrayList;

public class Tri_A_Bul{

	
	
	public static void main(String []args) {
	ArrayList<Integer>list=new ArrayList<>();
	list.add(5);
	list.add(4);
	list.add(2);
	list.add(1);
	list.add(6);
	list.add(7);
	int i,j, val;
	for( j=list.size()-1; j>=1; j--) {
		 
		for( i=1; i<=j; i++) {
			if(list.get(i-1)>list.get(i)) {
				val=list.get(i-1);
				list.set(i-1, list.get(i));
				list.set(i, val);
				
			}
			
			
			
		}
		
		
	}
	System.out.println(list.toString());
	
}
}
