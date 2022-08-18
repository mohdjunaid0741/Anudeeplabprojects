import java.util.*;
public class Calculator {
	int a = 4, b = 2;
	
	public void addition()
	{
		System.out.println("Addition of a and b: " + (a+b));
	}
	public void substraction()
	{
		System.out.println("Subtraction of a and b: " + (a-b));
	}
	public void multiplying()
	{
		System.out.println("Multiplication of a and b: " + (a*b));
	}
	public void dividing()
	{
		System.out.println("Division of a and b: " + (a/b));
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.addition();
		cal.substraction();
		cal.multiplying();
		cal.dividing();
		
	}

}
