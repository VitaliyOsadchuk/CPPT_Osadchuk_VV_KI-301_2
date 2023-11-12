package KI301_Osadchuk_Lab6;

import java.util.ArrayList; 

public class GunSafe <T extends GunSafeInfo>{ 
	private ArrayList<T> arr; 
	public GunSafe() { 
		arr = new ArrayList<T>();
		} 


//find minimal capacity 
	public T findMinPrice() { 
		if (!arr.isEmpty()) { 
			T min = arr.get(0); 
			for (int i = 1; i < arr.size(); i++) { 
				if (arr.get(i).compareTo(min) < 0) 
					min = arr.get(i); 
				} 
			return min; 
			} 
		return null;
		} 

 

	public void WriteToPC(T dani) { 
		arr.add(dani); 
		System.out.println("\n"); 
		dani.print_info();
		} 
	
	
	public void DeleteData(int x) 
	{ 
		arr.remove(x);
		} 
	
} 