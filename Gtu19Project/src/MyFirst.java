import java.util.Scanner;

public class MyFirst 
{

	public static void main(String[] args)
	{
		int a,b,c;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ENTER NO1:");
		a=scan.nextInt();
		
		System.out.print("ENTER NO2:");
		b=scan.nextInt();
		
		c=a/b;
		
		System.out.println("\nDIVISION:"+c);
		
	}

}
