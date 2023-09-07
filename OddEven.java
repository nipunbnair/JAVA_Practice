import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers in set ");
        int x = sc.nextInt();
        int z;
        int odd = 0, even = 0;
        System.out.println("Enter integers in set ");
        for(int i = 0; i<x;i++)
        {
            z  = sc.nextInt();
            if (z%2 == 0)
            {
                even+= z;
            }
            else{
                odd+=z;

            }
        }
        System.out.println("The sum of odd numbers in set is "+odd);
        System.out.println("The sum of even numbers in set is "+even);
    sc.close();
    }
}
