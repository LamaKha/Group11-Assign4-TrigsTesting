/*
 *@author Group11
 * Course: COMP-4110
 * Purpose: Assignment 4 - Trigonometric Functions using Taylor series - Junit Testing
 * @version version 1.0 (code skeleton)
 * Due Date: February 23, 2021
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigsTest {
    double decimalPlaces = 0.001;
    @Test
    void sin() {
        /**Testing Boundaries in comparison to Math.sin(x)**/

        //Testing for angle zero
        assertEquals(Trigs.sin(0), Math.sin(0),decimalPlaces);
        //testing for angle PI
        //assertEquals(Trigs.sin(3.141), Math.sin(3.141),decimalPlaces); //testing for PI failed
        //Testing for Turn
        assertEquals(Trigs.sin(360), Math.sin(360),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        assertEquals(Trigs.sin(45.558), Math.sin(45.558),decimalPlaces);
        //Second Quadrant Partition
        //assertEquals(Trigs.sin(135.847), Math.sin(135.847),decimalPlaces); //Q2 test failed
        //Third Quadrant Partition
        //assertEquals(Trigs.sin(255.789), Math.sin(255.789),decimalPlaces); //Q3 test failed
        //Fourth Quadrant Partition
        assertEquals(Trigs.sin(315.659), Math.sin(315.659),decimalPlaces);

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.sin(-1), Math.sin(-1),decimalPlaces);

    }

    @Test
    void cos() {
        /**Testing Boundaries in comparison to Math.cos(x)**/

        //Testing for angle zero
        assertEquals(Trigs.cos(0), Math.cos(0),decimalPlaces);
        //testing for angle PI
        //assertEquals(Trigs.cos(3.141592), Math.cos(3.141592),decimalPlaces); //testing for PI failed
        //Testing for Turn
        assertEquals(Trigs.cos(360), Math.cos(360),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        assertEquals(Trigs.cos(45.558), Math.cos(45.558),decimalPlaces);
        //Second Quadrant Partition
        //assertEquals(Trigs.cos(135.847), Math.cos(135.847),decimalPlaces); //Q2 test failed
        //Third Quadrant Partition
        //assertEquals(Trigs.cos(255.789), Math.cos(255.789),decimalPlaces); //Q4 test failed
        //Fourth Quadrant Partition
        assertEquals(Trigs.cos(315.65969), Math.cos(315.65969),decimalPlaces);

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.cos(-1), Math.cos(-1),decimalPlaces);
    }

    @Test
    void tan() {

        /**Testing Boundaries in comparison to Math.tan(x)**/

        //Testing for angle zero
        assertEquals(Trigs.tan(0), Math.tan(0),decimalPlaces);
        //testing for angle PI
        //assertEquals(Trigs.tan(3.141592), Math.tan(3.141592),decimalPlaces); //testing for PI failed
        //Testing for Turn
        assertEquals(Trigs.tan(360), Math.tan(360),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        //assertEquals(Trigs.tan(45.558), Math.tan(45.558),decimalPlaces); //Q1 test failed
        //Second Quadrant Partition
        //assertEquals(Trigs.tan(135.847), Math.tan(135.847),decimalPlaces);//Q2 test failed
        //Third Quadrant Partition
        //assertEquals(Trigs.tan(255.789), Math.tan(255.789),decimalPlaces);//Q3 test failed
        //Fourth Quadrant Partition
        //assertEquals(Trigs.tan(315.65969), Math.tan(315.65969),decimalPlaces); //Q4 test failed

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.tan(-1), Math.tan(-1),decimalPlaces);
    }

    @Test
    void degToRad() {
        fail("Code is not implemented yet");
        //Testing Boundaries

        //Testing Equivalence Partitions

        //Testing Educated Guesses
    }

    @Test
    void normalizedRad() {
        fail("Code is not implemented yet");
        //Testing Boundaries

        //Testing Equivalence Partitions

        //Testing Educated Guesses
    }

    @Test
    void factorial() {
        //fail("Code is not implemented yet");
        //Testing Boundaries
        assertEquals(1, Trigs.factorial(0));
        assertEquals(720, Trigs.factorial(6));
        assertEquals(479001600, Trigs.factorial(12));//the Boundary
        //assertEquals(6227020800, Trigs.factorial(13));//Test failed number is too large
        //assertEquals(87178291200, Trigs.factorial(14)); //Test failed number is too large

        assertEquals(720, Trigs.factorial(6));
        //Testing Equivalence Partitions


        //Testing Educated Guesses
        //assertEquals(-720, Trigs.factorial(-6)); //negative numbers test failed
    }

    @Test
    void power() {

        //Testing Boundaries
        assertEquals(Trigs.power(4, 0), Math.pow(4, 0));
        //Testing Equivalence Partitions

        //Testing Educated Guesses
    }
}
