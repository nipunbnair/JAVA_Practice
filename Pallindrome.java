public class Pallindrome {
    public static boolean pal(int num)
    {
        int n = num;
        int rev = 0;
        int rem;
        while(n>0)
        {
        rem = n%10;
        rev = rev*10+rem;
        n = n/10;
        }
        if (rev == num)
        return true;
        else 
        return false;
        
    }
    public static void main(String[] args)
    {
        
       System.out.println(pal(201));
       System.out.println(pal(202));

    }
}
