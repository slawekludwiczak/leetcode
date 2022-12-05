package roman_to_integer;

class Solution {
    public int romanToInt(String s) {
        return Roman.toArabic(s);
    }
    
    public enum Roman {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        final int value;

        Roman(int value) {
            this.value = value;
        }

        static int toArabic(String romanNumber) {
            Roman[] romanSymbols = values();
            int romanIndex = 0;
            int arabic = 0;
            while (!romanNumber.isEmpty()) {
                Roman symbol = romanSymbols[romanIndex];
                if (romanNumber.startsWith(symbol.name())) {
                    arabic += symbol.value;
                    romanNumber = romanNumber.substring(symbol.name().length());
                } else {
                    romanIndex++;
                }
            }
            return arabic;
        }

    }
}