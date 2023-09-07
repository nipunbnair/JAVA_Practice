public class distinctarray {
    public static boolean distinctarrayreturn( int a[])
    {   for (int i = 0; i<a.length; i++)
        {
            for (int j = i+1; j<a.length-1; j++)
            {
                if(a[i] == a[j])
                {return false;}
            }
        
            
        }
        return true;
    }
    public static void main(String[] args) {
    int a[] = new int[]{0, 1, 0, 1, 0, 0};
    boolean status = distinctarrayreturn(a);
    if (status == false)
       {System.out.println("Distinct Array"); } 
    else
        {System.out.println("Not Distinct Array");}  
    }
}
