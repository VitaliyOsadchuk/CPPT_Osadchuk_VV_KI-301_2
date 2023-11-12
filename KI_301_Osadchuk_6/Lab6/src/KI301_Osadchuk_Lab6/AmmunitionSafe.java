package KI301_Osadchuk_Lab6;

public class AmmunitionSafe implements GunSafeInfo{ 
	private String mark; 
	private double Weight; 
	private double Size; 
	private int Capacity; 
	private int Price; 
	private String material; 

public AmmunitionSafe(){ 
	this.mark = "Griffon"; 
	this.Weight = 5.0; 
	this.Size = 22.25; 
	this.Capacity = 45; 
	this.Price = 2500; 
	this.material = "Метал";
	} 

 
public AmmunitionSafe(String mark, double Weight, double Size,int Capacity, int Price, String material){ 
	this.mark = mark; 
	this.Weight = Weight; 
	this.Size = Size; 
	this.Capacity = Capacity; 
	this.Price = Price; 
	this.material = material;
	} 

 
public AmmunitionSafe(double Weight, double Size,int Capacity, int Price){ 
	this.mark = "New Gun Company"; 
	this.material = "Метал"; 
	this.Weight = Weight; 
	this.Price = Price; 
	this.Size = Size; 
	this.Capacity = Capacity;
	} 

 

@Override 
public double getSize() { 
	return this.Size; 
	} 

 

@Override 
public int getCapacity() { 
	return this.Capacity; 
	} 

 

@Override 
public double getWeight() { 
	return this.Weight; 
	} 

 

@Override 
public int getPrice() { 
	return this.Price; 
	} 

 

@Override 
public String getMaterial() { 
	return this.material; 
	} 

 

@Override 
public void print_info() { 
	System.out.println("\tПатронний сейф"); 
	System.out.println("Марка --> " + this.mark); 
	System.out.println("Матеріал --> " + this.material); 
	System.out.println("Розмір --> " + this.Size + " см^2."); 
	System.out.println("Вага --> " + this.Weight + " кг."); 
	System.out.println("Вмістимість --> " + this.Capacity + "см^3."); 
	System.out.println("Ціна --> " + this.Price + " грн."); 
	} 

 

@Override 
public int compareTo(GunSafeInfo o) { 
	Integer to_compare = Price; 
	return to_compare.compareTo(o.getPrice()); 
	}

} 