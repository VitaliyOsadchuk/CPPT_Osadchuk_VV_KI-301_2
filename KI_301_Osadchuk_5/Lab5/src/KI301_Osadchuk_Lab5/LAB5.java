package KI301_Osadchuk_Lab5;
import java.io.*;
import java.util.*;


public class LAB5 {
/**
* @param args
*/
public static void main(String[] args) throws FileNotFoundException, IOException
{
// TODO Auto-generated method stub
CalcWFio obj = new CalcWFio();
Scanner s = new Scanner(System.in);
System.out.print("Enter data: ");
double data = s.nextDouble();
System.out.print("X: " + data +"°\n");
obj.calculate(data);
System.out.println("Result is: " + obj.getResult());
obj.writeResTxt("textRes.txt");
obj.writeResBin("BinRes.bin");
obj.readResBin("BinRes.bin");
System.out.println("(bin)Result is: " + obj.getResult());
obj.readResTxt("textRes.txt");
System.out.println("(txt)Result is: " + obj.getResult());
}
}
class CalcWFio
{
public void writeResTxt(String fName) throws FileNotFoundException
{
PrintWriter f = new PrintWriter(fName);
 f.printf("%f ",result);
f.close();
}
public void readResTxt(String fName)
{
try
{
File f = new File (fName);
if (f.exists())
{
Scanner s = new Scanner(f);
result = s.nextDouble();
s.close();
}
else
throw new FileNotFoundException("File " + fName + "not found");
}
catch (FileNotFoundException ex)
{
System.out.print(ex.getMessage());
}
}
public void writeResBin(String fName) throws FileNotFoundException, IOException
{
DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
f.writeDouble(result);
f.close();
}
public void readResBin(String fName) throws FileNotFoundException, IOException
{
DataInputStream f = new DataInputStream(new FileInputStream(fName));
result = f.readDouble();
f.close();
}
public void calculate(double x)
{
	double y, rad;
	rad = x * Math.PI / 180.0;
    try {
        y =  (Math.tan(rad) / (Math.sin(4*rad))-(2*Math.cos(rad)));
        if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x==90 || 
        		x== -90|| x==270 || x== -270|| x==90 || x== 0|| x==180 || x== -180|| x==360 || x== -360)
        		throw new ArithmeticException();
        result = y;
    } catch (ArithmeticException e){
        System.out.println("Arithmetic exception: illegal value.");
    }
}
public double getResult()
{
return result;
}
private double result;
}