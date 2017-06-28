package assignment3;

public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;               
		char[] chars = new char[x];
		for  (int i = 0; i < x; i++) 
			/* here we are declaring the value of 'x' which is stored integer value .
			 * then the value of x is stored in the character char by creating a new character char[x],
			 * from FOR loop we are giving a statement to check the statement is correct or not ,after checking the character value will be printed
			 * 
			 */          
		{
		 chars[i] = 'X';
		 chars[x - 1 - i] = 'X'; 
		 
		 
		 for (int j = 0; j < x; j++) //here for initialize the number of columns we use for loop in the loop ,if the given values are satsfied to the statement then it complies the loop 
		  {
		    if (j == i || j == (x - 1 - i)) //it executes the or condition
		    	
		      {
		        continue;// if the statement is true it continues it will the value of x exceeds 
		      }
		  chars[j] = ' ';//here to give an empty space we use j value
		  }
		System.out.println(new String(chars));
			
			}

	}

}
