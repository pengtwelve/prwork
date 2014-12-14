import java.io.*;
import java.util.*;
import java.math.*;

public class p1005
{
	public static void main(String[] args) {
		final double pi = 3.1415926535;

        double dX = 0.0;
        double dY = 0.0;
		int num = 0;
		int iLoop = 0;

		Scanner cin = new Scanner(System.in);

		num = cin.nextInt();
		for (; iLoop < num; iLoop++)
		{
			dX = cin.nextDouble();
			dY = cin.nextDouble();

		    System.out.printf("Property %d: This property will begin eroding in year %d.\n", iLoop+1, (int)Math.ceil(pi*(dX*dX + dY*dY)/100.0));
		}

		System.out.println("END OF OUTPUT.");
	}
}