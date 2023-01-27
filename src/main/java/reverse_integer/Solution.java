package reverse_integer;

class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int max = Integer.MAX_VALUE/10;
        int min = Integer.MIN_VALUE/10;
        while(x != 0){
            int pop = x % 10;
            x /= 10;

            if (reversed > max || (reversed == max && pop > 7)) {
                return 0;
            } else if (reversed < min || (reversed == min && pop < -8)) {
                return 0;
            }

            reversed = reversed * 10 + pop;
        }
        return reversed;
    }

//    public int reverse(int x) {
//        long max = Integer.MAX_VALUE;
//        long reversed = 0;
//        int sign = x > 0? 1 : -1;
//        long lx = Math.abs((long)x);
//        while (lx != 0) {
//            long next = lx % 10;
//            reversed = reversed * 10 + next;
//            lx = lx / 10;
//            if (reversed > max) {
//                return 0;
//            }
//        }
//        long reversedWithSign = reversed * sign;
//        if (reversedWithSign < Integer.MIN_VALUE) {
//            return 0;
//        }
//        return (int)reversedWithSign;
//    }

//    public int reverse(int x) {
//        int reversed = 0;
//        int sign = x > 0? 1 : -1;
//        x = Math.abs(x);
//        while (x != 0) {
//            int next = x % 10;
//            try {
//                reversed = Math.multiplyExact(reversed, 10);
//                reversed = Math.addExact(reversed, next);
//            } catch (ArithmeticException e) {
//                return 0;
//            }
//            x = x / 10;
//        }
//        return reversed * sign;
//    }
}
