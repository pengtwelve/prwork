import java.math.*;
import java.io.*;
import java.util.*;

public class p1003
{
	public static void main(String[] args) {
		final double e = 2.718281828459;
		final double r = 0.5772156649;

		Scanner cin = new Scanner(System.in);
		double d_input = 0.0;
		d_input = cin.nextDouble();
		while(d_input != 0.0)
		{
			System.out.println((int)Math.ceil(Math.pow(e, d_input - r + 1.0) - 2.0));
			d_input = cin.nextDouble();
		};
	}
}