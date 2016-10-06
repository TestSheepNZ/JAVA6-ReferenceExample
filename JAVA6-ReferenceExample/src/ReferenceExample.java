/*
 * This program is part of my learning Java series
 * This one looks at what happens when variables passed to a method
 * are changed
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-6-avoiding-tangled-code-with.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

public class ReferenceExample {

	private static void incrementNumber(int num)
	{
		num++;
		System.out.println("Inside method - number set to ..." + num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		
		System.out.println("Initialised number set to ..." + number);
		
		incrementNumber(number);
		
		System.out.println("Outside method - number set to ..." + number);
	}
}
