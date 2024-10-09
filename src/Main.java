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