package string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0 || str.isBlank()) return 0;

        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
//    public int myAtoi(String s) {
//        if (s.length() >= 200) {
//            throw new IllegalArgumentException();
//        }
//        char[] chars = s.toCharArray();
//        char sign = Character.MIN_VALUE;
//        long result = 0;
//        boolean illegal = false;
//        for (int i = 0; i < chars.length; i++) {
//            char nextChar = chars[i];
//            if (result == 0) {
//                if (nextChar == '-' || nextChar == '+') {
//                    if (sign != Character.MIN_VALUE) {
//                        return 0;
//                    }
//                    sign = nextChar;
//                    continue;
//                }
//                if (nextChar == ' ' || nextChar == '0') {
////                    if (sign != Character.MIN_VALUE) {
////                        break;
////                    }
//                    continue;
//                }
//            }
//            if (nextChar < '0' || nextChar > '9') {
//                if (nextChar != ' ' && nextChar != '.') {
//                    illegal = true;
//                }
//                break;
//            }
//            int nextInt = nextChar - '0';
//            if (sign == '-') {
//                result = result * 10 - nextInt;
//            } else {
//                result = result * 10 + nextInt;
//            }
//            if (result > Integer.MAX_VALUE) {
//                return Integer.MAX_VALUE;
//            } else if (result < Integer.MIN_VALUE) {
//                return Integer.MIN_VALUE;
//            }
//        }
//        return illegal? 0 : (int)result;
//    }

}
