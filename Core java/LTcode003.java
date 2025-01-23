class LTcode003{
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int sign = 1;
        int index = 0;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        int result = 0;
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (!Character.isDigit(ch)) break;
            int digit = ch - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
    public static void main(String[] args) {
        LTcode003 solution = new LTcode003();
        String str = "   -42";
        int result = solution.myAtoi(str);
        System.out.println("Converted integer: " + result);
    }
}