package com.bridgelabz.IOPro;
import com.bridgelabz.utility.IOUtility;


import java.io.FileNotFoundException;
import java.util.*;


public class PoemLyrics 
{ 

    public static void main(String[] args)throws FileNotFoundException 
    {
			 
		 
			Scanner sc=new Scanner(System.in);
			System.out.println("please select menu");
			
			System.out.println("a. Chicks ­ chick\n"
					+ "b. Duck ­ quack\n"
					+ "c. Turkey ­ gobble\n"
					+ "d. Pig ­ oink, oink\n"
					+ "e. Cow ­ moo, moo\n"
					+ "f. Cat ­meow, meow\n"
					+ "g. Mule ­ Heehaw\n" 
					+ "h. Dog ­ bow wow\n" 
					+ "i. Turtle ­ nerp, nerp\n"
					);
			char userchoice=sc.next().charAt(0);
			switch (userchoice) 
			{
			case 'a':
				IOUtility.poemlyrics("Chicks", "chick");
				break;
			case 'b':
				IOUtility.poemlyrics("Duck", "quack");
				break;
			 case 'c':
				IOUtility.poemlyrics("Turkey", "gobble");
				break;
			case 'd':
				IOUtility.poemlyrics("Pig", "oink");
				break;
			case 'e':
				IOUtility.poemlyrics("Cow", "moo");
				break;
			case 'f':
				IOUtility.poemlyrics("Cat", "meow");
				break;
			case 'g':
				IOUtility.poemlyrics("Mule", "Heehaw");
				break;
			case 'h':
				IOUtility.poemlyrics("Dog", "bow");
				break;
			case 'i':
				IOUtility.poemlyrics("Turtle", "nerp");
				break;
			default:
				System.out.println("Select proper input");
				break;
			}
			sc.close();

		}

}
