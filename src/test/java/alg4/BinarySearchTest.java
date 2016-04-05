package alg4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void findExactInOneElementArray() throws Exception {
        final int[] a1 = new int[]{1};
        assertEquals(0, BinarySearch.binarySearch(1, a1));
    }

    @Test
    public void notFoundInOneElementArray() throws Exception {
        final int[] a1 = new int[]{1};
        assertEquals(-1, BinarySearch.binarySearch(2, a1));
    }

    @Test
    public void test2() throws Exception {
        final int[] a1 = new int[]{1, 2, 5, 10, 100};
        assertEquals(-1, BinarySearch.binarySearch(9, a1));
    }

    @Test
    public void genericTest() throws Exception {
        final Integer[] a1 = new Integer[]{1};
        assertEquals(-1, BinarySearch.binarySearchG(Integer.valueOf(2), a1));
    }
}
