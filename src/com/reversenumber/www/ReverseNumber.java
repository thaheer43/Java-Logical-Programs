package com.reversenumber.www;

public class ReverseNumber 

{
	   public static void main(String args[])
	   {
	      int num=886788678;
	      int reversenum =0;
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of specified number is: "+reversenum);
	   }
	}