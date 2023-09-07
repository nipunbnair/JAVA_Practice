public class Verizon {
    public static void triangle_print(int n)
    {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Even row, print numbers in descending order
                for (int j = start + i - 1; j >= start; j--) {
                    System.out.print(j);
                    if (j > start) {
                        System.out.print(" ");
                    }
                }
            } else {
                // Odd row, print numbers in ascending order
                for (int j = start; j < start + i; j++) {
                    System.out.print(j);
                    if (j < start + i - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // Move to the next line after each row
            start += i;
        }
    }
    public static int countSubstringOccurrences(String input, String pattern) {
        int count = 0;
        int index = input.indexOf(pattern);

        while (index != -1) {
            count++;
            index = input.indexOf(pattern, index + 1);
        }

        return count;
    }
    public static void main(String[] args) {
     triangle_print(5);
    System.out.println(countSubstringOccurrences("aaaaa", "aa")); 
    }
    
}
