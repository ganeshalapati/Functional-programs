
public class Harmonic_Num {
import java.util.Scanner;

	public static void main(String[] args) {
		double a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextDouble();
		double h=harmonicCal(a);
		System.out.println("Harmonic value = "+h);}
		
	static double harmonicCal(double n) 
	{
		double sum=0;
		for(double  i=1;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		return sum;
	}

}
