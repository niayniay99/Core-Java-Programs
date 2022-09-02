import java.util.*;
public class OddsAndEvens
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play a game called \" Odd and evens\" ");  //Welcome User 
		System.out.println("What is your name ? ");							// Asking A name
		String name = input.next();
		System.out.print("Hi! "+name);
		System.out.println(" ,What do you choose?? (O)dds or (E)vens");		//getting a option to choose from userinput
		String select = input.next();
		
		if((select.startsWith("O")) || (select.startsWith("o")))
		{
			System.out.println(name+" has picked up odds! now computer will be evens");		//informing user about game
		}
		else if((select.startsWith("E")) || (select.startsWith("e")))
		{
			System.out.println(name+" has picked up evens! now computer will be odds");			
		}
		else
		{
			System.out.println("select the correct option.");
		}
		System.out.println("How many \"fingers\" do you put");								//Asking to put numbers from user
		String usersinput = input.next();
		int userinput = Integer.valueOf(usersinput);
 
		Random rand = new Random();
		int computer = rand.nextInt(6);
		
		System.out.print("The computer plays "+computer);								//Taking computers turn
		System.out.println(" \"Fingers\". ");
		
		System.out.println("-------------");
		System.out.println();
		
		
		System.out.print(" "+userinput);
		System.out.print(" + "+computer);
		
		int sum=userinput+computer;
		System.out.println(" = "+sum);												//printing sum done
		
		if(sum % 2 ==0)
		{
			System.out.println(sum+"  is...even");
		}
		else
		{
			System.out.println(sum+" is...odd");
		}
		if(sum % 2 ==0)
		{
			if((select.startsWith("E")) || (select.startsWith("e")))
			{
				System.out.println(name+" wins the game ");
			}
			else
			{
				System.out.println("Computer wins the game");
			}
		}
		else if(sum % 2 != 0)
		{
			if((select.startsWith("O")) || (select.startsWith("o")))
			{
				System.out.println(name+" wins the game ");
			}
			else
			{
				System.out.println("Computer wins the game");
			}
		}
		
	}
}