public class tripletsum {

    public static void findtriplets(int a[] , int sum)
    {
        for(int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j<a.length; j++)
            {
                for (int k = j+1; k<a.length;k++)
                {
                    if (a[i]+a[j]+a[k] == sum)
                    {
                        System.out.println("Triplets are  "+a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            } 
        }
    }
    public static void main (String args [])
    {
        int a[] = new int[]{0, 1, 2, 3, 4, 5};
        int sum = 10;
        findtriplets(a,sum);
    
    
    }
}
