package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortZerosTest {

    @Test
    void testSortZeros() {
        int[] arr = {1,2,0,3,4,0,0,5,7,1};
        SortZeros sort = new SortZeros();
        arr = sort.sortZeros(arr);
        int[] expected = { 0, 0, 0, 3, 4, 2, 1 ,5 ,7 ,1};
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortAllZeros() {
        int[] arr = {0,0,0,0,0};
        SortZeros sort = new SortZeros();
        arr = sort.sortZeros(arr);
        int[] expected = { 0, 0, 0, 0, 0};
        assertArrayEquals(expected, arr);
    }
}
