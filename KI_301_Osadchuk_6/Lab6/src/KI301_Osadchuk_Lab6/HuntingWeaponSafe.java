package KI301_Osadchuk_Lab6;

public class HuntingWeaponSafe implements GunSafeInfo{ 

	private String mark; 
	private double Weight; 
	private double Size; 
	private int Capacity; 
	private int Price; 
	private String material; 


	public HuntingWeaponSafe(){ 
		this.mark = "FEROCON"; 
		this.Weight = 16.0; 
		this.Size = 80.25; 
		this.Capacity = 120; 
		this.Price = 4530; 
		this.material = "Метал";
		} 

	public HuntingWeaponSafe(String mark, double Weight, double Size,int Capacity, int Price, String material){ 
		this.mark = mark; 
		this.Weight = Weight; 
		this.Size = Size; 
		this.Capacity = Capacity; 
		this.Price = Price; 
		this.material = material; 
		} 

 

	public HuntingWeaponSafe(double Weight, double Size,int Capacity, int Price){ 
		this.mark = "New Gun Company"; 
		this.material = "Метал"; 
		this.Weight = Weight; 
		this.Price = Price; 
		this.Size = Size; 
		this.Capacity = Capacity;
		} 

 
@Override 
public double getSize() 
	{ 
	return this.Size;
	} 

 

@Override 
public int getCapacity() 
	{ 
	return this.Capacity;
	} 

 

@Override 
public double getWeight() 
	{ 
	return this.Weight; 
	} 

 

@Override 
public int getPrice() 
	{ 
	return this.Price; 
	} 

 

@Override 
public String getMaterial() 
	{ 
	return this.material; 
	} 

 

@Override 
public void print_info() { 
	System.out.println("\tСейф для мисливської зброї"); 
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