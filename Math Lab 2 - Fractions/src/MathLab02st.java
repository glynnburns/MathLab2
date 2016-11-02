// MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.


import java.util.Scanner;

import javax.swing.JOptionPane;


public class MathLab02st
{
	public static void main (String args[])
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator "); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num,den);
		JOptionPane.showMessageDialog(null,r.getOrigional()+r.getRational()+" which equals "+r.getDecimal());
          
		System.exit(0);
	}
}

				



//	Rational
class Rational 
{
	private int num, den, onum, oden;

public Rational(int n, int d){
	onum = num = n;
	oden = den = d;
	reduce();
}
//	getNum
	public int getNum ()
	{
		return num;
	}
	
	
//	getDen
    public int getDen()
    {
    	return den;
    }
	
//getDecimal
    public double getDecimal()
    {
    	return (double)num/den;
    }
	
	
//	getRational 
	public String getRational()
	{
		return num+"/"+den;
	}
	
//	getOriginal
public String getOrigional()
{
	return onum+"/"+oden+" reduces to ";
}
	
//	reduce
	private void reduce()
	{
		num = onum/getGCF(onum, oden);
		den = oden/getGCF(onum, oden);
	}

	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	} 
}



	

 


