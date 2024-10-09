import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        for(int c = 0; c <= 30; c++)
        {
            System.out.print("" + c + " ");
        }
    }
}

class Decrementing
{
    public static void main(String[] args)
    {
        for(int n = 30; n >= 0; n--)
        {
            System.out.print("" + n + " ");
        }
    }
}

class UpByThree
{
    public static void main(String[] args)
    {
        for(int t = 0; t <= 18; t += 3)
        {
            System.out.print("" + t + " ");
        }
    }
}

class DownByTwo
{
    public static void main(String[] args)
    {
        for(int w = 10; w >= 0; w -= 2)
        {
            System.out.print("" + w + " ");
        }
    }
}

class SquareFigure
{
    public static void main(String[] args)
    {
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class TriangleIncreasing
{
    public static void main(String[] args)
    {
        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class TriangleDecreasing
{
    public static void main(String[] args)
    {
        for(int row = 5; row >= 1; row--)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int dieSum = 0;
        int rollNum = 0;
        String userContinue = "";
        boolean done = false;

        do {
            System.out.println("\nRoll    Die1    Die2    Die3    Sum");
            System.out.println("--------------------------------------");
            die1 = 0;
            die2 = 1;
            die3 = 2;

            while (die1 != die2 || die2 != die3) {
                   rollNum++;

                   die1 = gen.nextInt(6) + 1;
                   die2 = gen.nextInt(6) + 1;
                   die3 = gen.nextInt(6) + 1;

                   dieSum = die1 + die2 + die3;

                   System.out.printf("%4d %7d %7d %7d %6d", rollNum, die1, die2, die3, dieSum);
                   System.out.println();
            }
            System.out.print("\nWould you like to play again? Enter Q to quit or press any other key to continue: ");
            userContinue = in.nextLine();

            if(userContinue.equalsIgnoreCase("Q")) {
                done = true;
            }
        }while(!done);
    }
}