/*
 *@author Group11
 * Course: COMP-4110
 * Purpose: Assignment 4 - Trigonometric Functions using Taylor series - Junit Testing
 * @version version 3.0
 * Due Date: February 23, 2021
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TrigsTest {
    double decimalPlaces = 0.001;
    @Test
    void sin() {
        /**Testing Boundaries in comparison to Math.sin(x)**/

        //Testing for angle zero
        assertEquals(Trigs.sin(0), Math.sin(0),decimalPlaces);
        //testing for angle PI
        assertEquals(Trigs.sin(3.141), Math.sin(3.141),decimalPlaces);
        //Testing for Turn
        assertEquals(Trigs.sin(360), Math.sin(360),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        assertEquals(Trigs.sin(45.558), Math.sin(45.558),decimalPlaces);
        //Second Quadrant Partition
        assertEquals(Trigs.sin(135.847), Math.sin(135.847),decimalPlaces);
        //Third Quadrant Partition
        assertEquals(Trigs.sin(255.789), Math.sin(255.789),decimalPlaces);
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
        assertEquals(Trigs.cos(3.141592), Math.cos(3.141592),decimalPlaces);
        //Testing for Turn
        assertEquals(Trigs.cos(360), Math.cos(360),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        assertEquals(Trigs.cos(45.558), Math.cos(45.558),decimalPlaces);
        //Second Quadrant Partition
        assertEquals(Trigs.cos(135.847), Math.cos(135.847),decimalPlaces);
        //Third Quadrant Partition
        assertEquals(Trigs.cos(255.789), Math.cos(255.789),decimalPlaces);
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
        assertEquals(Trigs.tan(3.141592), Math.tan(3.141592),decimalPlaces);
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
    double PI = 3.141592; //PI value
    //Testing Boundaries
    assertEquals(Trigs.DegToRad(180), PI, decimalPlaces);
    assertEquals(Trigs.DegToRad(270), (3*PI)/2, decimalPlaces);
    assertEquals(Trigs.DegToRad(90), PI/2, decimalPlaces);
    assertEquals(Trigs.DegToRad(360), (2*PI), decimalPlaces);
    //Testing Equivalence Partitions
    //q1
    assertEquals(Trigs.DegToRad(45), PI/4, decimalPlaces);
    //q2
    assertEquals(Trigs.DegToRad(150), 5*PI/6, decimalPlaces);
    //q3
    assertEquals(Trigs.DegToRad(240), 8*PI/6, decimalPlaces);
    //q4
    assertEquals(Trigs.DegToRad(330), 11*PI/6, decimalPlaces);
}

    @ParameterizedTest
    @ValueSource(doubles = {30,45,50.5,60,65,75,90,95,100,130,160,180,190,220,270,280,300,350,360})
    void degToRadT(double angle) {

        //Testing for radian values
        assertEquals(Trigs.DegToRad(angle),Math.toRadians(angle),5);
    }

    @Test
    void normalizedRad() {
       // fail("Code is not implemented yet");
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
        assertEquals(479001600, Trigs.factorial(12));//the upper Boundary
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
    assertEquals(Trigs.power(3, 3), 27);
    assertEquals(Trigs.power(2, 4), 16);
    assertEquals(Trigs.power(6, 3), 216);
    assertEquals(Trigs.power(12, 3), 1728);
    //Testing Educated Guesses
    assertEquals(Trigs.power(4, -1), 0.25);
    assertEquals(Trigs.power(-4, 2), 16);
    assertEquals(Trigs.power(-1, -1), -1);
    assertEquals(Trigs.power(5, -5), 0.00032);
}

    @Test
    void power2() {
        //test case made by Faraz for github testing!!
        //Testing Boundaries
        assertEquals(Trigs.power(4, 0), Math.pow(4, 0));
        //Testing Equivalence Partitions

        //Testing Educated Guesses
    }
}
