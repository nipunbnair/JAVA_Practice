public class bitmanip {
    public static void oddoreven(int n)
    {  int bitmask = 1;
       if((n & bitmask) == 0)
       {
        System.out.println("Even");
       }
       else 
       System.out.println("odd");

    }
    public static int ithbit(int i, int n)
    {  
        int bitmask = 1<<i;
        return n & bitmask;

    }
    public static int setithbit(int i, int n)
    {  
        int bitmask = 1<<i;
        return n | bitmask;

    }
    public static int clearithbit(int i, int n)
    {  
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static int updateithbit(int i, int n,int nbit)
    {   int k;
        if (nbit == 0)
        k = clearithbit(i, n);
        else
        k = setithbit(i, n);

        return k;
    }
    public static int clearbits(int i, int j, int n)
    {  
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;

    }
    public static boolean powoftwo(int n)
    {return (n & n-1) == 0;}

    
    public static int fast_exponentiation(int a, int n)
    {  
        int ans = 1;
        while(n>0)
        {
            if ((n&1) !=0)
            {  ans = ans*a;
                

            }
          a = a*a;
          n = n>>1;
        }

        return ans;
    }

    public static int setbitsno(int n)
    {   int count = 0;

        while(n > 0) 
        {
            if((n & 1) != 0)
            {
                count++;
            }

            n = n >> 1;
        }

        return count;
    }





    public static void main(String[] args) {
        oddoreven(2);
        System.out.println(ithbit(2, 20));
        System.out.println(setithbit(2, 20));
        System.out.println(clearithbit(2, 20));
        System.out.println(updateithbit(2, 20,1));
        System.out.println(clearbits(2, 5,1000));
        System.out.println(powoftwo(15438));
        System.out.println(powoftwo(2048));
        System.out.println(fast_exponentiation(7, 5));
        System.out.println(setbitsno(2048));

        
    }

    
}
