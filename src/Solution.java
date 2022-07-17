class Solution {
    public int romanToInt(String s) {

        int accumulator = 0;

        int idx = 0;

        while (idx < s.length()) {

            int stepTwoSymbols = Math.min(idx + 2, s.length());
            String nextTwoSymbols = s.substring(idx, stepTwoSymbols);

            if (Roman.IV.name().equals(nextTwoSymbols) || Roman.IX.name().equals(nextTwoSymbols)
                    || Roman.XL.name().equals(nextTwoSymbols) || Roman.XC.name().equals(nextTwoSymbols)
                    || Roman.CD.name().equals(nextTwoSymbols) || Roman.CM.name().equals(nextTwoSymbols)) {
                accumulator += Roman.valueOf(nextTwoSymbols).getBase();
                idx += 2;
            }
            else {
                String firstLiteral = nextTwoSymbols.substring(0, 1);
                accumulator += Roman.valueOf(firstLiteral).getBase();
                idx += 1;
            }
        }

        return accumulator;
    }
}

enum Roman {

    IV(4),
    IX(9),

    XL(40),
    XC(90),

    CD(400),
    CM(900),

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int base;

    Roman(int base) {
        this.base = base;
    }

    public int getBase() {
        return this.base;
    }

}