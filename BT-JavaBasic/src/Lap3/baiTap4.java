/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class baiTap4 {
    	public static void main(String[] args)
	{
                Scanner sr = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sr.nextInt();
		String[] studentName = new String[numberOfStudents];
		float[] studentScore = new float[numberOfStudents];
		
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.print("Student name: ");
			sr = new Scanner(System.in);
			studentName[i] = sr.nextLine();
			
			System.out.print("Student score: ");
			studentScore[i] = sr.nextFloat();
		}
		
		for(int i = 0;i<numberOfStudents-1;i++)
		{
			for(int j = i+1;j<numberOfStudents;j++)
			{
				if(studentScore[i]>studentScore[j])
				{
					float tempScore = studentScore[i];
					studentScore[i] = studentScore[j];
					studentScore[j] = tempScore;
					
					String tempName = studentName[i];
					studentName[i] = studentName[j];
					studentName[j] = tempName;
				}
			}
		}
		
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.println("Student " + (i+1));
			if(studentScore[i]>=9)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i] +"\nAcademic evaluation: EXCELLENT");
			}
			else if(studentScore[i] <9 && studentScore[i] >=7.5)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: VERY GOOD");
			}
			else if(studentScore[i] <7.5 && studentScore[i] >=6.5)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: GOOD");
			}
			else if(studentScore[i] <6.5 && studentScore[i] >=5)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: AVERAGE GOOD");
			}
			else
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: ORDINARY");
			}
		}
	}
    
}
