import java.util.Random;
import java.util.Scanner;
public class codsoft1 {
public static void main(String[] args) {
	while(true)
	{
		
	int ran_str,max=100,min=1,guess,count=0,i,point_count=0;
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	ran_str=min+ran.nextInt(max);
	for(i=count;i<3;i++)
	{
		System.out.println("Guess the no between 1 to 100");
		guess=sc.nextInt();
		if(guess==ran_str)
		{
			System.out.println("Good job, the number was "+ran_str);
			point_count++;
		}
		else {
			count++;
			System.out.println("Better luck next time, the number was "+ran_str);
			if(guess>ran_str)
			{
				System.out.println("Your guess is to high.");
			}
			else
			{
				System.out.println("Your guess is to low.");
			}
	}
	
}
	System.out.println("otained marks 3 out of "+point_count);
	System.out.println("Do you want to play again? Yes/NO");
	String input=sc.next();
	   if (input.equalsIgnoreCase("no")) {
           sc.close();
           System.out.println("Thankyou for playing.........");
           System.exit(0);

}
}
}
}

