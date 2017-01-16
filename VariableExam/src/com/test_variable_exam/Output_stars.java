package com.test_variable_exam;
import java.util.Scanner;
import java.util.Arrays;

public class Output_stars
{
	public static void main(String args[])
	{
		/*
		int i;
		int j;
		String[][] star = new String[10][10];
		Scanner scanner = new Scanner(System.in);
		String stars = scanner.nextLine();
		
		for(i=0;i<=10; i++)
		{
			for(j=0;j<(10-i); j++)
			{
				star[i][j] = "*";
				System.out.print(star[i][j]);
			}
			System.out.print("\n");
		}
		for(i=0;i<=10; i++)
		{
			for(j=0;j<i; j++)
			{
				star[i][j] = "*";
				System.out.print(star[i][j]);
			}
			System.out.print("\n");
		}
		*/
		/**/
		int start1, start2, inc1, inc2;
		char char1, char2;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("숫자를 입력하세요.");
			String select = scanner.nextLine();
			if(select.equals("1"))
			{
				start1 = 1; start2 = 4; inc1 = 1; inc2 = -1;
				char1 = '*'; char2 = ' ';
			}
			else if(select.equals("2"))
			{
				start1 = 4; start2 = 1; inc1 = -1; inc2 = 1;
				char1 = ' '; char2 = '*';
			}
			else
			{
				start1 = 5; start2 = 0; inc1 = -1; inc2 = 1;
				char1 = '*'; char2 = ' ';
			}
			for(int i = 0; i < 5; i++, start1 += inc1, start2 += inc2)
			{
				for(int j = 0; j < start1; j++)
				{
					System.out.print(char1);
				}
				for(int j = 0; j < start2; j++)
				{
					System.out.print(char2);
				}
				System.out.println();
			}
			System.out.println("계속 하시겠습니까?(y/n)");
		}
		while(scanner.nextLine().equals("y"));
	}

}
