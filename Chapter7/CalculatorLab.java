import java.util.Scanner;

public class CalculatorLab
{
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        char decision;
        do{
            System.out.print("Enter a number: ");
            double num1 = Double.parseDouble(keyboard.nextLine());

            System.out.print("Enter an operation: ");
            char op = keyboard.nextLine().charAt(0);

            System.out.print("Enter another number: ");
            double num2 = Double.parseDouble(keyboard.nextLine());

            double answer;
            answer=0;
            if (op == '+')
                answer = num1+num2;
            else if(op == '-')
                answer = num1-num2;
            else if(op == '*')
                answer = num1*num2;
            else if(op == '/')
                answer = num1/num2;
            else if(op == '%')
                answer = num1%num2;
            else
                System.out.print("Your characters were not understood, please try again");

            System.out.print(""+ num1 + op + num2 +" = "+ answer);
            System.out.println("Would you like to do another calculation?  ");
            decision = keyboard.nextLine().charAt(0);
        }
        while(decision == 'y'|| decision == 'Y');

    }
}
