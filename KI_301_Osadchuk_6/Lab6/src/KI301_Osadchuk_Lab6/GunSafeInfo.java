package KI301_Osadchuk_Lab6;

public interface GunSafeInfo extends Comparable<GunSafeInfo>{ 
	double getSize(); 
	int getCapacity(); 
	double getWeight(); 
	int getPrice(); 

	String getMaterial(); 
	void print_info(); 
} 