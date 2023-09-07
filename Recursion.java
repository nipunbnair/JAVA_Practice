public class Recursion{
    public static double power(double x, int n) {
        if (n == 0) {
            return 1; // x^0 is 1 for any x (except 0)
        } else if (n < 0) {
            return 1 / power(x, -n); // x^-n is 1 / x^n
        } else if (n % 2 == 0) {
            double temp = power(x, n / 2);
            return temp * temp; // x^n = (x^(n/2))^2 for even n
        } else {
            return x * power(x, n - 1); // x^n = x * x^(n-1) for odd n
        }
    }
    public static int findFirstOccurrence(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1; // Element not found
        }
        
        if (arr[index] == target) {
            return index; // Found the element at index
        }
        
        return findFirstOccurrence(arr, target, index + 1); // Recursive call for next index
    }

    public static int findLastOccurrence(int[] arr, int target, int index) {
        if (index < 0) {
            return -1; // Element not found
        }
        
        if (arr[index] == target) {
            return index; // Found the element at index
        }
        
        return findLastOccurrence(arr, target, index - 1); // Recursive call for previous index
    }
    public static int countWaysToTile(int n) {
        if (n <= 2) {
            return n; // Base cases: 1 way to tile 1x2, 2 ways to tile 1x2
        }
        
        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        
        return ways[n];
    }
    public static void remove_duplicates(String str, int idx, StringBuilder sb, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar >= 'a' && currChar <= 'z') {
            if (!map[currChar - 'a']) {
                map[currChar - 'a'] = true;
                sb.append(currChar);
            }
            remove_duplicates(str, idx + 1, sb, map);
        } else {
            remove_duplicates(str, idx + 1, sb, map);
        }
    }
    public static int friends_pairing(int n)
    { 
        if (n == 1||n == 2)
          return n;
       return (friends_pairing(n-1) + (n-1)*friends_pairing(n-2));
    }
    public static void binary_strings_problem(int n, int lastplace, String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        if (lastplace == 1) {
            binary_strings_problem(n - 1, 0, str + "0");
            binary_strings_problem(n - 1, 1, str + "1");
        } else {
            binary_strings_problem(n - 1, 1, str + "1");
        }

    }
    public static void permutations(String str, String ans)
    { if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, ans+curr);
        }
    }


    public static void main(String[] args) {
        double x = 2.0;
        int n = 5;
        double result = power(x, n);
        System.out.println(x + " ^ " + n + " = " + result);
        int[] arr = {2, 4, 6, 8, 4, 10, 4, 12};
        int target = 4;

        int firstOccurrence = findFirstOccurrence(arr, target, 0);
        int lastOccurrence = findLastOccurrence(arr, target, arr.length - 1);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index " + firstOccurrence);
        } else {
            System.out.println(target + " not found in the array.");
        }

        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of " + target + " is at index " + lastOccurrence);
        } else {
            System.out.println(target + " not found in the array.");
        }
        n = 4; // Size of the rectangle
        int ways = countWaysToTile(n);
        
        System.out.println("Number of ways to tile a 2x" + n + " rectangle: " + ways);
        String str =  "apnacollege";
        StringBuilder sb = new StringBuilder();
        boolean[] map = new boolean[26];
        remove_duplicates(str,0,sb,map);
        System.out.println(friends_pairing(10));
        String s = "";
        binary_strings_problem(5,1,s);
        permutations("abc", s);
    }
}