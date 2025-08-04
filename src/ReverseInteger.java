public class ReverseInteger {
    public static void main(String[] args) {
        int number = 1534236469;
        System.out.println(reverse(number));
        //this above is an edge case where the input is crosses the limits so 0 is returned
    }
    static public int reverse(int x) {
        int reversed=0;
        while(x!=0){
            int digit=x%10;
            x=x/10;
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed=reversed*10+digit;
        }
        return reversed;
    }
}
