import java.math.*;
import java.io.*;
import java.util.*;

public class p1003_2
{
	public static void main(String[] args) {
        double dCount = 2.0;
        double sum = 0.0;

		Scanner cin = new Scanner(System.in);
		double dInput = 0.0;
		dInput = cin.nextDouble();
		while(dInput != 0.0)
		{
			sum = 0.0;
			dCount = 2.0;
			while(true)
			{
				sum += 1.0/dCount;
				if (sum > dInput)
				{
					break;
				}
				dCount += 1.0;
			}
			System.out.printf("%d %s\n", ((int)(dCount - 1.0)), "card(s)");
			dInput = cin.nextDouble();
		};
	}
}