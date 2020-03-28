package _08_Paired_letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairedLettersHelperTest {
    @Test
    void deletePairedLetters1() {
        var result = PairedLettersHelper.deletePairedLetters("aab");
        assertEquals("b", result);
    }

    @Test
    void deletePairedLetters2() {
        var result = PairedLettersHelper.deletePairedLetters("abfbaf");
        assertEquals("abfbaf", result);
    }

    @Test
    void deletePairedLetters3() {
        var result = PairedLettersHelper.deletePairedLetters("abccbaf");
        assertEquals("f", result);
    }

    @Test
    void deletePairedLetters4() {
        var result = PairedLettersHelper.deletePairedLetters("");
        assertEquals("", result);
    }

    @Test
    void deletePairedLetters5() {
        var result = PairedLettersHelper.deletePairedLetters("1");
        assertEquals("1", result);
    }

    @Test
    void deletePairedLetters6() {
        var result = PairedLettersHelper.deletePairedLetters("aaa");
        assertEquals("a", result);
    }

    @Test
    void deletePairedLetters7() {
        var result = PairedLettersHelper.deletePairedLetters("aaaa");
        assertEquals("", result);
    }

    @Test
    void deletePairedLetters8() {
        var result = PairedLettersHelper.deletePairedLetters("abcd");
        assertEquals("abcd", result);
    }
}