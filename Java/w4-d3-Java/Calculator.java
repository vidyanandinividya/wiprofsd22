import java.util.Scanner;
class Calculator
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        int num1,num2;
        String choice;
            System.out.println("Enter the first number");
            num1=sc.nextInt();
            System.out.println("Enter the second number");
            num2=sc.nextInt();
        if(num1>0 && num2>0)
        {
        do
        {
            System.out.println("Calculator Menu");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your option");
            choice=sc.next();
            switch(choice)
                {
                    case "1":
                        System.out.println("Sum:"+(num1+num2));
                        break;
                    case "2":
                        System.out.println("Sub:"+(num1-num2));
                        break;
                    case "3":
                        System.out.println("Mul:"+(num1*num2));
                        break;
                    case "4":
                        System.out.println("Div:"+(num1/num2));
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter valid option");

                }
            }while(choice!="5");  
            
        }
        else
            {
                System.out.println("Enter the positive number");
            }

        }
    }
    

