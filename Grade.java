import java.util.Scanner;
class Grade
{
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks=scan.nextInt();
        scan.close();

        if (marks>90)
        {
            System.out.println("Excellent");
        }
        else if(marks>80 )
        {
            System.out.println("GOOD");
        }
        else if(marks>70)
        {
            System.out.println("Fair");
        }
        else if(marks>60)
        {
            System.out.println("Meets Expectation");
        }
        else
        {
            System.out.println("Bad");
        }
    }
}
