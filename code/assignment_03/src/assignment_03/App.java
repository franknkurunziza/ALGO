package assignment_03;

import ignore.TestingUtils;

public class App {

	
	/**
	 * Given three ints, a b c, return true if it is possible to add two of 
	 * the ints to get the third. There should only be a single line of code in the method body.<br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		twoSumOne(1, 2, 3)   <b>---></b> true <br>
		twoSumOne(3, 1, 2)    <b>---></b> true <br>
		twoSumOne(3, 2, 2) <b>---></b> false <br>
	 */
		public static boolean twoSumOne(int a, int b, int c) {
			//input=a,b,c
			//true or false
			//x+y=k x=k-y   a+b=c or b+c=a or a+c=b
			if(a+b==c || b+c==a || a+c==b){ return true;}
			return false;

		}
		
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}