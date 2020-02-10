import java.util.Scanner;
import java.lang.*;
class Calculator
{
   public static void main(String args[])
   {
      char operator;
	   while(true)
	   {
	      System.out.println("Enter your choice:\nAddition --> \'+\'\nSubtraction --> \'-\'\nMultiplication --> \'*\'\nDivision --> \'/\'\nModular Division --> \'%\'");
	      Scanner s=new Scanner(System.in);
	      operator=s.next().charAt(0);
	      float first_operand,second_operand;
          System.out.println("Enter first operand:");
          first_operand=s.nextFloat();
          System.out.println("Enter second operand:");
          second_operand=s.nextFloat();
	      switch(operator)
	      {
	         case '+': System.out.println("You have selected ADDITION operation");
		                System.out.println("Addition of "+first_operand+" and "+second_operand+" is: "+(first_operand+second_operand));
		                break;
	         case '-': System.out.println("You have selected SUBTRACTION operation");
		                System.out.println("Subtraction of "+first_operand+" and "+second_operand+" is: "+(first_operand-second_operand));
		                break;
	         case '*': System.out.println("You have selected MULTIPLICATION operation");
		                System.out.println("Multiplication of "+first_operand+" and "+second_operand+" is: "+(first_operand*second_operand));
		                break;
	         case '/': System.out.println("You have selected DIVISION operation");
		                System.out.println("Division of "+first_operand+" and "+second_operand+" is: "+(first_operand/second_operand));
	                   break;
	         case '%': System.out.println("You have selected MODULAR DIVISION operation");
		                System.out.println("Modular Division of "+first_operand+" and "+second_operand+" is: "+(first_operand%second_operand));
		                break;
	         default: System.out.println("INVALID CHOICE");
		               System.exit(0);
	      }
      }
   }
}
