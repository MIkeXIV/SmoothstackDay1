import java.util.Scanner;

public class JavaHW1
{
	public static void rightTriangle(int size) 
	{
		int i, j;
		for(i = 0; i < size; i++) 
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
	}
	
	public static void flippedRightTriangle(int size) 
	{
		int i, j;
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
		for(i = 0; i < size; i++)
		{	
			for(j = 0; j < size - i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangle(int size)
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size*2; j++)
			{
				int starsNum = i*2+1;
				int spacesNum = size*2-1 - starsNum;
				if (j <= spacesNum/2 || j > spacesNum/2 + starsNum)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			
			}
			System.out.println();
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
	}
	
	
	public static void flippedTriangle(int size) 
	{
		for (int i=0; i < size; i++)
		{
			for (int j=0; j < size*2; j++)
			{
				int starsNum = size*2 - i*2;
				if (j < i || j > starsNum + i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
			
	
	public static void main(String[] args)
	{
		Scanner scanNum = new Scanner(System.in);
		System.out.println("Enter the function number and size of triangle");
		int funcNum = scanNum.nextInt();
		int size = scanNum.nextInt();
		if(funcNum == 1)
		{
			rightTriangle(size);
		}
		if(funcNum == 2)
		{
			flippedRightTriangle(size);
		}
		if(funcNum == 3)
		{
			triangle(size);
		}
		if(funcNum == 4)
		{
			flippedTriangle(size);
		}
		if(funcNum > 4)
		{
		System.out.println("Invalid function number");
		}
	
	}
	

}

