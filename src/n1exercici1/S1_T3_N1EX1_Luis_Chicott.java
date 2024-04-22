package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class S1_T3_N1EX1_Luis_Chicott {

	public static void main(String[] args) {
		
	ArrayList<Month> months = new ArrayList<Month>();
		
	HashSet<Month> months2 = new HashSet<Month>();

	
		months.add(new Month("January")); 
		months.add(new Month("February"));
		months.add(new Month("March"));
		months.add(new Month("April")); 
		months.add(new Month("May")); 
		months.add(new Month("June")); 
		months.add(new Month("July"));
		months.add(new Month("September"));
		months.add(new Month("October")); 
		months.add(new Month("November")); 
		months.add(new Month("December"));	
		
		System.out.println("11 meses del año sin el mes 'Agosto': ");
		System.out.println(months); 
		
		System.out.println();
		months.add(7, new Month("August"));
		
		System.out.println("Todos los meses del año: ");		
		System.out.println(months); 

		System.out.println();
		
		System.out.println("Todos los meses del año impresos con un for: ");
		
		for (int i = 0; i < months.size(); i ++) {
			System.out.print(months.get(i).getName() + " ");
		} 
		
		
		System.out.println("\n");
		
		
        months2.addAll(months); 	
		months2.add(new Month("February"));
		months2.add(new Month("January")); 
		
		System.out.println("Todos los meses del año agregados un HashSet, se prueba duplicar \"January\" y \"February\" y no lo hace. Se recorre con un for: "); 
		
		for (Month month : months2) {
			System.out.print(month.getName() + " ");
		} 
		
		System.out.println("\n");
		
		Iterator<Month> it = months2.iterator(); 
		
		System.out.println("Rocorrido de HashSet con un iterador: ");
		while(it.hasNext()) {
			String month = it.next().getName(); 
			System.out.print(month + " "); 
		}
		
	}
}


