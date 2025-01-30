import java.util.Scanner;

class Oddeven
{
    public static void main(String arg[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = scan.nextInt();
        scan.close();
        if(x> 0)
        {
            System.out.println(x + " is positive number");
        }
        else if(x<0)
        {
            System.out.println(x + " is negative number");
        }
        else
        {
            System.out.println(x + " is zero");
        }
    }
}
