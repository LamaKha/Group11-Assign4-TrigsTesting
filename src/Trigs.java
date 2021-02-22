/*
 *@author Group11
 * Course: COMP-4110
 * Purpose: Assignment 4 - Trigonometric Functions using Taylor series - Code
 * @version version 3.0
 * Due Date: February 23, 2021
 */

import java.util.Scanner;

public class Trigs {



    /**
     * This method calculates sin(x)
     * Input: angle value
     * Return: sin value of x
     */

    public static double sin(double angle)
    {
        double sin=0;
        double newAngle = normalizedRad (angle);
        //factorial function can go up to 170
        //we think that 17 will be enough for this assignment
        //by TDD testing we discovered that the upper boundary for this function is 12
        //then we changed the number from 17 to 12
        for(int i=1;i<=12;i++)
        {
            sin = sin + (power(-1, i-1)*power(newAngle, (2*i)-1)/factorial((2*i)-1));
        }

        return sin;
    }

    /**
     * This method calculates sin(x) using degrees
     * Input: angle value
     * Return: sin value of x
     */
    public static double sind(double angle)
    {
        double val=DegToRad(angle);
        double ret=sin(val);

        return ret;
    }

    /**
     * This method calculates cos(x)
     * Input: angle value
     * Return: cos value of x
     */
    public static double cos(double angle)
    {
        double cos=0;
        double newAngle = normalizedRad (angle);
        //factorial function can go up to 170
        //we think that 17 will be enough for this assignment
        //by TDD testing we discovered that the upper boundary for this function is 12
        //then we changed the number from 17 to 12
        for(int i=1;i<=12;i++)
        {
            cos = cos + (power(-1, i-1)*
                    power(newAngle, 2*(i-1))/factorial(2*(i-1)));
        }

        return cos;
    }

    /**
     * This method calculates cos(x) using degrees
     * Input: angle value
     * Return: cos value of x
     */
    public static double cosd(double angle)
    {
        double val=DegToRad(angle);
        double ret=cos(val);

        return ret;
    }

    /**
     * This method calculates tan(x)
     * Input: angle value
     * Return: tan value of x
     */
    public static double tan(double angle)
    {
        double tan=0;
        tan = sin(angle) / cos (angle);
        return tan;
    }

    /**
     * This method calculates tan(x)
     * Input: angle value
     * Return: tan value of x
     */
    public static double tand(double angle)
    {
        double val=DegToRad(angle);
        double ret=tan(val);

        return ret;
    }

    /*
     * This method coverts Degree to Radian
     * Input: x deg
     * Return: returns x in radian
     */

    public static double DegToRad (double x)
    {
        //double PI = 3.141592; //PI value
        double PI=Math.PI;
        double Turn = 360;  //full cycle
        return (2* x * PI)/ Turn ;
    }

    /*
     * This method normalizes radian to be between -2 PI and 2 PI
     * Input: x rad
     * Return: returns normalized radian
     */

    public static double normalizedRad (double x)
    {   double PI = 3.141592; //PI value
        return x % (PI*2);
    }

    /*
     * This method calculates factorial
     * Input: n (any value)
     * Return: returns normalized radian
     */
    public static long factorial (int n)
    {
        if (n == 0)
            return 1;
        else return (n* factorial(n-1));
    }

    /**
     * This method is calculates the power
     * Input: b as the base and p as the power
     * Returns: the power value
     */
    public static double power(double b, int p)
    {
        double result=1;

        if(p == 0)
            return result;

        for(int i=1; i<=p; i++)
            result = result * b;

        return result;

    }
}
