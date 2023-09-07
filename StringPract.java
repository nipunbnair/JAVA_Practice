import java.util.Arrays;

public class StringPract {
    public static int lowervowel(String s)
    {   int count = 0;
        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
            {
                count ++;
            }
        }
        return count;
    }
    public static boolean anagrams(String s, String t)
    {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String sortedString1 = new String(charArray1);
        String sortedString2 = new String(charArray2);
        if(sortedString1.length() == sortedString2.length())
        {  
            for(int i = 0, j = 0; i<sortedString1.length() && j<sortedString2.length();i++,j++)
                {   if(sortedString1.charAt(i) != sortedString2.charAt(j))
                    {
                        return false;
                    }
                    
            
                }
                return true;
                

        }
        
        return false;

        
    }
   public static void main(String[] args) {
    String s = "nipun";
    String k1 = "apple";
    String k2 = "leppa";
    System.out.println(lowervowel(s));
    System.out.println("Anagrams  "+ anagrams(k1, k2));
        
    }
}
