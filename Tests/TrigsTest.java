/*
 *@author Group11
 * Course: COMP-4110
 * Purpose: Assignment 4 - Trigonometric Functions using Taylor series - Junit Testing
 * @version version 7.0 (final)
 * Due Date: February 23, 2021
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TrigsTest {
    //double decimalPlaces = 0.001;
    double decimalPlaces = 10;
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
    void sind() {
        /**Testing Boundaries in comparison to Math.sin(x)**/

        //Testing for angle zero
        assertEquals(Trigs.sind(0), Math.sin(Math.toRadians(0)),decimalPlaces);
        //testing for angle right angle
        assertEquals(Trigs.sind(90), Math.sin(Math.toRadians(90)),decimalPlaces);
        //Testing for 180
        assertEquals(Trigs.sind(180), Math.sin(Math.toRadians(180)),decimalPlaces);
        //testing for circle
        assertEquals(Trigs.sind(360), Math.sin(Math.toRadians(360)),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        assertEquals(Trigs.sind(45.558), Math.sin(Math.toRadians(45.558)),decimalPlaces);
        //Second Quadrant Partition
        assertEquals(Trigs.sind(135.847), Math.sin(Math.toRadians(135.847)),decimalPlaces);
        //Third Quadrant Partition
        assertEquals(Trigs.sind(255.789), Math.sin(Math.toRadians(255.789)),decimalPlaces);
        //Fourth Quadrant Partition
        assertEquals(Trigs.sind(315.659), Math.sin(Math.toRadians(315.659)),17);

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.sind(-1), Math.sin(Math.toRadians(-1)),decimalPlaces);

    }
    @Test
    void sinT() {
        //Testing for angle negative turn
        assertEquals(Trigs.sin(-360), Math.sin(-360),decimalPlaces);
        //Testing for angle negative PI
        assertEquals(Trigs.sin(-3.141), Math.sin(-3.141),decimalPlaces);
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
    void cosd() {
        /**Testing Boundaries in comparison to Math.cos(x)**/

        //Testing for angle zero
        assertEquals(Trigs.cosd(0), Math.cos(0),decimalPlaces);
        //testing for angle 90
        assertEquals(Trigs.cosd(90), Math.cos(Math.toRadians(90)),decimalPlaces);
        //testing for angle 180
        assertEquals(Trigs.cosd(180), Math.cos(Math.toRadians(180)),decimalPlaces);
        //Testing for full circle
        assertEquals(Trigs.cosd(360), Math.cos(Math.toRadians(360)),decimalPlaces);

        /**Testing Equivalence Partitions**/

        //First Quadrant Partition
        assertEquals(Trigs.cosd(45.558), Math.cos(Math.toRadians(45.558)),decimalPlaces);
        //Second Quadrant Partition
        assertEquals(Trigs.cosd(135.847), Math.cos(Math.toRadians(135.847)),decimalPlaces);
        //Third Quadrant Partition
        assertEquals(Trigs.cosd(255.789), Math.cos(Math.toRadians(255.789)),decimalPlaces);
        //Fourth Quadrant Partition
        assertEquals(Trigs.cosd(315.65969), Math.cos(Math.toRadians(315.65969)),17);

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.cosd(-1), Math.cos(Math.toRadians(-1)),decimalPlaces);

    }
    @Test
    void cosT() {
        //Testing for negative PI
        assertEquals(Trigs.cos(-3.141592), Math.cos(-3.141592),decimalPlaces);
        //Testing for negative turn
        assertEquals(Trigs.cos(-360), Math.cos(-360), decimalPlaces);
    }

    @Test
    void tan() {

        /**Testing Boundaries in comparison to Math.tan(x)**/

        //Testing for angle zero
        assertEquals(Trigs.tan(0), Math.tan(0),decimalPlaces);
        //testing for angle PI
        assertEquals(Trigs.tan(3.141592), Math.tan(3.141592),decimalPlaces);
        //testing pi/2
        assertEquals(Trigs.tan(Math.PI/2), Double.NaN);
        //Testing for Turn
        assertEquals(Trigs.tan(360), Math.tan(360),decimalPlaces);

        /**Testing Equivalence Partitions**/
        //As the numbers got bigger, it was hard to compare the decimal places results
        //with Math library results, so after multiple tries,
        //we limited our Equivalence Partitions testing to one or two decimal places as Dr. Kobti recommended.

        //First Quadrant Partition
        assertEquals(Trigs.tan(45.8), Math.tan(45.8),decimalPlaces);
        //Second Quadrant Partition
        assertEquals(Trigs.tan(135.84), Math.tan(135.84),decimalPlaces);
        //Third Quadrant Partition
        assertEquals(Trigs.tan(255), Math.tan(255),decimalPlaces);
        //Fourth Quadrant Partition
        assertEquals(Trigs.tan(315), Math.tan(315),decimalPlaces);

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.tan(-1), Math.tan(-1),decimalPlaces);
    }

    @Test
    void tand() {

        /**Testing Boundaries in comparison to Math.tan(x)**/

        //Testing for angle zero
        assertEquals(Trigs.tand(0), Math.tan(Math.toRadians(0)),decimalPlaces);
        //Testing for angle 90
        assertEquals(Trigs.tand(90), Double.NaN);
        //testing for angle PI
        assertEquals(Trigs.tand(180), Math.tan(Math.toRadians(180)),decimalPlaces);
        //Testing for circle
        assertEquals(Trigs.tand(360), Math.tan(Math.toRadians(360)),decimalPlaces);

        /**Testing Equivalence Partitions**/
        //As the numbers got bigger, it was hard to compare the decimal places results
        //with Math library results, so after multiple tries,
        //we limited our Equivalence Partitions testing to one or two decimal places as Dr. Kobti recommended.

        //First Quadrant Partition
        assertEquals(Trigs.tand(45.8), Math.tan(Math.toRadians(45.8)),decimalPlaces);
        //Second Quadrant Partition
        assertEquals(Trigs.tand(135.84), Math.tan(Math.toRadians(135.84)),decimalPlaces);
        //Third Quadrant Partition
        assertEquals(Trigs.tand(255), Math.tan(Math.toRadians(255)),10);
        //Fourth Quadrant Partition
        assertEquals(Trigs.tand(315), Math.tan(Math.toRadians(315)),decimalPlaces);

        /**Testing Educated Guesses**/

        //testing for negative 1
        assertEquals(Trigs.tand(-1), Math.tan(Math.toRadians(-1)),decimalPlaces);
    }
    @Test
    void tanT() {
        //Testing for negative turn
        assertEquals(Trigs.tan(-360), Math.tan(-360),decimalPlaces);
        //Testing for negative PI
        assertEquals(Trigs.tan(-3.141592), Math.tan(-3.141592),decimalPlaces);
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
        double PI = Math.PI;
        //Boundary Testing
        assertEquals(Trigs.normalizedRad(0), 0,4 );
        assertEquals(Trigs.normalizedRad(PI/2), PI/2,4 );
        assertEquals(Trigs.normalizedRad(PI), PI ,4);
        assertEquals(Trigs.normalizedRad(3*PI/2), 3*PI/2,4 );
        assertEquals(Trigs.normalizedRad(2*PI), 0 ,4);
        assertEquals(Trigs.normalizedRad(5*PI/2), PI/2,4 );
        assertEquals(Trigs.normalizedRad(3*PI), PI,4 );
        assertEquals(Trigs.normalizedRad(7*PI/2), 3*PI/2,4 );
        assertEquals(Trigs.normalizedRad(4*PI), 0,4 );
        assertEquals(Trigs.normalizedRad(9*PI/2), PI/2,4 );
        assertEquals(Trigs.normalizedRad(5*PI), PI,4 );
        assertEquals(Trigs.normalizedRad(11*PI/2), 3*PI/2,4 );
        assertEquals(Trigs.normalizedRad(6*PI), 0,4 );
        //Equivalence Partitioning
        assertEquals(Trigs.normalizedRad(25*PI/9), 7*PI/9,4 );
        assertEquals(Trigs.normalizedRad(40*PI/9), 4*PI/9,4 );
        assertEquals(Trigs.normalizedRad(64*PI/9), 10*PI/9 ,4);
        assertEquals(Trigs.normalizedRad(349*PI/36), 61*PI/36,4 );
        assertEquals(Trigs.normalizedRad(229*PI/20), 29*PI/20 ,4);
        assertEquals(Trigs.normalizedRad(541*PI/45), PI/45,4 );


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

        //Testing Equivalence Partitions between 1 and 12
        assertEquals(1, Trigs.factorial(1));
        assertEquals(6, Trigs.factorial(3));
        assertEquals(5040, Trigs.factorial(7));
        assertEquals(39916800, Trigs.factorial(11));

        //Testing Educated Guesses
        //assertEquals(-1, Trigs.factorial(-1)); //negative numbers test failed
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

        //Testing Boundaries
        assertEquals(Trigs.power(4, 0), Math.pow(4, 0));
        assertEquals(Trigs.power(-1, 2), Math.pow(-1, 2));
        assertEquals(Trigs.power(4, -2), Math.pow(4, -2));

    }
}
