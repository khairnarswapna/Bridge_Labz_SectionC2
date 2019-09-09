package com.bridgelabz.IOPro;

import java.io.*;
 
import java.util.Arrays;

public class DeterminantFiles{

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String output = "";
		File file = new File("/home/slot2/eclipse-workspace/BOOT/Section_C2/src/com/bridgelabz/TextFile/matrix.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		try {
			str = bufferedReader.readLine();
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] strArr = str.split(",");

		int[] arr = new int[strArr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				arr[i] = Integer.parseInt(strArr[i]);
			} catch (NumberFormatException nfe) {
				System.err.println(nfe);
			}
			;

		}

		int[][] M = new int[3][3];
		
		k = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				M[i][j] = arr[k];
				k++;
			}
		}

		int det = M[1][1] * M[2][2] - M[2][1] * M[1][2];
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				System.out.print(M[i][j] + " ");
				output += M[i][j] + " ";
			}
			output += "\n";
			System.out.println();
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[1][0] * M[2][2] - M[2][0] * M[1][2];
		for (int i = 1; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j != 1) {
					System.out.print(M[i][j] + " ");
					output += M[i][j] + " ";
				}

			}
			output += "\n";
			System.out.println();
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		
		det = M[1][0] * M[2][1] - M[2][0] * M[1][1];  
		for (int i = 1; i < 3; i++)  
		{
			for (int j = 0; j < 2; j++) 
			{

				System.out.print(M[i][j] + " ");
				output += M[i][j] + " ";
			}
			output += "\n";
			System.out.println();
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[0][1] * M[2][2] - M[2][1] * M[0][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if (i != 1) {
					System.out.print(M[i][j] + " ");
					output += M[i][j] + " ";
				}
			}
			if (i != 1) {
				output += "\n";
				System.out.println();
			}
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[0][0] * M[2][2] - M[2][0] * M[0][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i != 1 && j != 1) {
					System.out.print(M[i][j] + " ");
					output += M[i][j] + " ";
				}
			}
			if (i != 1) {
				output += "\n";
				System.out.println();
			}

		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[0][0] * M[2][1] - M[2][0] * M[0][1];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i != 1 && j != 2) {

					output += M[i][j] + " ";
					System.out.print(M[i][j] + " ");
				}
			}
			if (i != 1) {
				System.out.println();
				output += "\n";
			}

		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[0][1] * M[1][2] - M[1][1] * M[0][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i != 2 && j != 0) {
					output += M[i][j] + " ";
					System.out.print(M[i][j] + " ");
				}
			}
			if (i != 2) 
			{
				System.out.println();
				output += "\n";
			}
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[0][0] * M[1][2] - M[1][0] * M[0][2];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			 {
				if (i != 2 && j != 1) 
				{
					System.out.print(M[i][j] + " ");
					output += M[i][j] + " ";
				}
			}
			if (i != 2) {
				System.out.println();
				output += "\n";
  			}
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		det = M[0][0] * M[1][1] - M[1][0] * M[0][1];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i != 2 && j != 2) {
					System.out.print(M[i][j] + " ");
					output += M[i][j] + " ";
				}
			}
			if (i != 2) {
				System.out.println();
				output += "\n";
			}
		}
		System.out.println("Determinant " + det+"\n");
		output +="Determinant " + det+"\n";
		
		//putting output into the matrixoutput file
		File file2=new File("/home/slot2/eclipse-workspace/BOOT/Section_C2/src/com/bridgelabz/TextFile/matrixop.txt");
		try 
		{
			FileWriter fw=new FileWriter(file2);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(output);
			bw.close();
			
		} catch (IOException e) 
		{
		 
			
			e.printStackTrace();
		}
		

	}

}
 