
import java.util.*;
public class codsoft2 {
public static void main(String[] args) {
	int Num_Sub,i,Total_Marks=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of subject.");
	Num_Sub=sc.nextInt();
	int marks[]=new int[Num_Sub];
	for(i=0;i<Num_Sub;i++)
	{
		System.out.println("Enter the marks obtained out of 100 in subject " + (i + 1) + ": ");
		marks[i]=sc.nextInt();
	}
	for(i=0;i<Num_Sub;i++)
	{
		Total_Marks+=marks[i];
	}
	Float Average_Percentage=(float) Total_Marks/Num_Sub;
	  String grade;
      if (Average_Percentage >= 90) {
          grade = "A";
      } else if (Average_Percentage >= 80) {
          grade = "B";
      } else if (Average_Percentage >= 70) {
          grade = "C";
      } else if (Average_Percentage >= 60) {
          grade = "D";
      } else {
          grade = "F";
      }
      System.out.println("Total marks: " + Total_Marks+"/"+(Num_Sub*100));
      System.out.println("Average percentage: " + Average_Percentage);
      System.out.println("Grade: " + grade);
      sc.close();

}
}
