public class SumSubArrays {
    public static void brutesum(int arr[])
    {  int maxsum = Integer.MIN_VALUE,minsum = Integer.MAX_VALUE,sum;
        for(int i = 0; i < arr.length; i++)
        {     
             for(int j = i; j < arr.length; j++)
            {   sum = 0;
                for(int k = i; k <= j; k++)
                    {
                        sum += arr[k];
                    }
                maxsum = Math.max(maxsum, sum);
                minsum = Math.min(minsum, sum);
                //System.out.println(sum);
            } 

                
        } 
        System.out.println("MaxSum of Sub Arrays "+maxsum);
        System.out.println("MinSum of Sub Arrays "+minsum);

    }
    public static void prefixsum(int arr[])
    {  int sum;
       int maxsum = Integer.MIN_VALUE,minsum = Integer.MAX_VALUE;
       int prefix [] = new int [arr.length];
       prefix[0] = arr[0];
       for(int i = 1; i<prefix.length;i++)
       {
        prefix[i] = prefix[i-1] + arr[i];
       }
       for(int i = 0; i < arr.length; i++)
       {   sum = 0;
           for(int j = i; j < arr.length; j++)
           {  if (i == 0)
              {
                sum = prefix[j];
              }
              else
              {
                 sum = prefix[j] - prefix[i-1];
              }
            maxsum = Math.max(maxsum, sum);
            minsum = Math.min(minsum, sum);  

           }

       }
        System.out.println("MaxSum of Sub Arrays "+maxsum);
        System.out.println("MinSum of Sub Arrays "+minsum);

    }
    public static void kadanessum(int arr[])
    { int sum = 0;
      int maxsum = Integer.MIN_VALUE,minsum = Integer.MAX_VALUE;
      for(int i =0; i<arr.length; i++)
      {
        sum = sum + arr[i];
        if(sum < 0)
        {
            sum = 0;
        }
        maxsum = Math.max(maxsum, sum);
        minsum = Math.min(minsum, sum); 

      }
       System.out.println("MaxSum of Sub Arrays "+maxsum);
       System.out.println("MinSum of Sub Arrays "+minsum);

    }

    public static void main(String args[])
    {
        int arr[] = new int[]{1,-2,3,1,2,1,4,3,-2};
        brutesum(arr);
        prefixsum(arr);
        kadanessum(arr);

    }
}
