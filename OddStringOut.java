public class OddStringOut {
    public static void main(String[] args) {
        String[] strings = {"ABC", "BCD", "CDE", "DFE"};
        String oddString = findOddString(strings);
        
        if (oddString != null) {
            System.out.println("The odd string out is: " + oddString);
        } else {
            System.out.println("No odd string found.");
        }
    }

    public static String findOddString(String[] strings) {
        for (String str : strings) {
            if (!hasConstantDifference(str)) {
                return str;
            }
        }
        return null;
    }

    public static boolean hasConstantDifference(String str) {
        if (str == null || str.length() < 2) {
            return true;
        }

        int diff = str.charAt(1) - str.charAt(0);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) - str.charAt(i) != diff) {
                return false;
            }
        }
        return true;
    }
}