package KI301_Osadchuk_Lab4;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.out;

public class EquationsApp {
	public static void main(String[] args) {
try
{
out.print("Enter file name: ");
Scanner in = new Scanner(System.in);
String fName = in.nextLine();
PrintWriter fout = new PrintWriter(new File(fName));
try
{
try
{
Equations eq = new Equations();
out.print("Enter X: ");
fout.print("Вираз: y = tg(x) / (sin(4x) – 2cos(x)) \n");
int var = in.nextInt();
fout.print("Значення X: " + var +"°\n");
fout.print("Результат: " + eq.calculate(var));
}
finally
{
// Цей блок виконається за будь-яких обставин
fout.flush();
fout.close();
}
}
catch (CalcException ex)
{
// Блок перехоплює помилки обчислень виразу
out.print(ex.getMessage());
}
}
catch (FileNotFoundException ex)
{
// Блок перехоплює помилки роботи з файлом навіть якщо вони
// виникли у блоці finally
out.print("Exception reason: Perhaps wrong file path");
}
}
}

class CalcException extends ArithmeticException
{
public CalcException(){}
public CalcException(String cause)
{
super(cause);
}
}

class Equations
{
/**
* Method calculates the y=tg(x)/(sin(4x) – 2cos(x)) expression
* @param <code>x</code> Angle in degrees
* @throws CalcException
*/
public double calculate(int x) throws CalcException
{
double y, rad;
rad = x * Math.PI / 180.0;
try
{
y = (Math.tan(rad) / (Math.sin(4*rad))-(2*Math.cos(rad)));
// Якщо результат не є числом, то генеруємо виключення
if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x==90 || 
x== -90|| x==270 || x== -270|| x==90 || x== 0|| x==180 || x== -180|| x==360 || x== -360)
throw new ArithmeticException();
}
catch (ArithmeticException ex)
{
if (x==0)
throw new CalcException("\"Exception reason: X = 0");

else
throw new CalcException("Input exception: illegal value.");
}
return y;
}
}