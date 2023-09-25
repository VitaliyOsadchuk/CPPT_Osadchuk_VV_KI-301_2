package lab1OsadchukKI301;
import java.util.Scanner;
import java.io.*;

/**
 * Клас Lab1 реалізує приклад програми для лабораторної роботи №1 варіант 18
 * 
 * @author Vitaliy_Osadchuk_KI301
 * @version 1.0
 * @since version 1.0
 * 
 */
public class Lab1OsadchukKI301 {   //варіант 18
	
	/**
	 * 
	 * №18  Статичний метод main є точкою входу в програму
	 * 
	 * @param args for main method
	 * @throws FileNotFoundException for opening file
	 * 
	 */
	
	public static void main(String[] args)  throws FileNotFoundException
    {
		char sym;// symbol
        Scanner scanner = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці:");
        int size = scanner.nextInt(); //size

        while (true) {
            System.out.print("Введіть символ для заповнення рамки та внутрішнього квадрата: ");
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Помилка: Введено більше одного символу. Будь ласка, введіть лише один символ.");
            } else {
                sym = input.charAt(0);
                break; // exit if entered symbol is correct
            }
        }
        char[][] matrix = new char[size][size];

      
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
                {
                    matrix[i][j] = sym;
                } else if (i == 1 || i == size - 2 || j == 1 || j == size - 2) 
                {
                    matrix[i][j] = ' '; //interval 1 symbol
                } else 
                {
                    matrix[i][j] = sym; //2nd
                }
            }
        }
        
        //output
        System.out.println("Заповнена квадратна матриця:");
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(matrix[i][j] + " ");
                fout.print(matrix[i][j] + " ");
            }
            System.out.println();
            fout.print("\n");
        }

        scanner.close();
        fout.flush();
        fout.close();

    }
}
