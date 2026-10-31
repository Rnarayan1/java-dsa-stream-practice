package DSA;

public class PallindromeNumber_LC9 {

    static void main() {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        int sum =0;
        int var = x;
        while(x > 0){

            int div = x%10;
            sum = (sum * 10)+div;
            x = x/10;
        }
        if (sum == var) return true;

        return false;
    }
}
