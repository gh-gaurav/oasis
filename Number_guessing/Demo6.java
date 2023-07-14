import java.util.Random.*;
import java.util.*;

class Game
{
	int number;
	int input_no;
    int attemp=1;
	
	Game()
	{
		Random r=new Random();
		number=r.nextInt(120);
	}
	void userInput()
	{
		System.out.println("GUESS THE NUMBER BETWEEN 1 TO 150");
		if(attemp<6)
		System.out.println("It's your = " +attemp+ " Attemp");
	    else
		System.out.println("It's your last Attemp");	
		Scanner sc=new Scanner(System.in);
		input_no=sc.nextInt();
		
	}
	boolean check_number()
	{
		
		if(attemp<6)
		{
	    if(input_no==number)
		{
			System.out.println("Yes You Guess Correct Number  ");
			System.out.print("You Got This Correct Number in " +attemp);
			System.out.println(" Attemp");
			System.out.println("Your Score is := " +(attemp*10));
			++attemp;
			return true;
		}
		else if(input_no<number)
		{
			
			System.out.println("Lower Number");
			++attemp;
			return false;
			
		}
	    else if(input_no>number);
		{
			
			System.out.println("Higher Number");
			++attemp;
			return false;
	    }
        }
		else
		{
			if(input_no==number)
			{
				System.out.println("Yes You Guess Correct Number  ");
			System.out.print("You Got This Correct Number in " +attemp);
			System.out.println(" Attemp");
			System.out.println("Your Score is := " +(attemp*10));
			return true;
			}
			else
			{
            System.out.println("---------------------Game Over---------------");
			 System.out.println("And The Correct Number is  : "+number);
			System.out.println("             Try Again.......!");
			return true;
			}
		}
		
	}
}

class Demo6
{
	public static void main(String ar[])
	{
		Game g=new Game();
		boolean b=false;
		System.out.println("\n \n---------------------Start Game---------------");
		while(!b)
		{
		 g.userInput();
		 b=g.check_number();
		 System.out.println();
		}
	}
}