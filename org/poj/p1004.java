import java.io.*;
import java.util.*;

public class p1004
{
	public static void main(String[] args) {
		double dInput = 0.0;
		double dSum = 0.0;
		int iLoop = 0;

		Scanner cin = new Scanner(System.in);
		for (; iLoop < 12; iLoop++)
		{
			dInput = cin.nextDouble();
			dSum += dInput;
		}

		System.out.printf("$%.2f\n", dSum/12.0);
	}
}