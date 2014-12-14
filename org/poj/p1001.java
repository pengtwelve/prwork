import java.math.*;
import java.io.*;
import java.util.*;

public class p1001
{
	public static void main(String[] args) {
		BigDecimal dInput = null;
		BigDecimal dResult = null;
		String tmpStr = null;
		int iN = 0;

		Scanner cin = new Scanner(System.in);

		while(cin.hasNext())
		{
			dInput = cin.nextBigDecimal();
			iN = cin.nextInt();

			dResult = dInput.pow(iN).stripTrailingZeros();
			tmpStr = dResult.toPlainString();
			if (tmpStr.startsWith("0."))
			{
				tmpStr = tmpStr.substring(1);
			}

            System.out.println(tmpStr);
		}
	}
}