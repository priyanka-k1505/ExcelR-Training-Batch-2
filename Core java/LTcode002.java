class LTCode002{
    public int reverse(int x) {
        int reversed = 0;
        int limit = Integer.MAX_VALUE / 10; // To check for overflow

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > limit || (reversed == limit && digit > 7)) {
                return 0; // overflow
            }
            if (reversed < -limit || (reversed == -limit && digit < -8)) {
                return 0; // underflow
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        LTCode002 solution = new LTCode002();

        int number = 123; // You can test with other numbers
        int result = solution.reverse(number);
        System.out.println("Reversed: " + result);
    }
}