import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testLVIII() {
        assertEquals(new Solution().romanToInt("LVIII"), 58);
    }

    @Test
    public void testMCMXCIV() {
        assertEquals(new Solution().romanToInt("MCMXCIV"), 1994);
    }

    @Test
    public void testI() {
        assertEquals(new Solution().romanToInt("I"), 1);
    }

    @Test
    public void testIII() {
        assertEquals(new Solution().romanToInt("III"), 3);
    }

}