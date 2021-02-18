/*
 *@author Group11
 * Course: COMP-4110
 * Purpose: Assignment 4 - Trigonometric Functions using Taylor series - Code
 * @version version 1.0 (code skeleton)
 * Due Date: February 23, 2021
 */

public class Trigs {

    /**
     * This method calculates sin(x)
     * Input: angle value
     * Return: sin value of x
     */
    public static double sin(double angle)
    {
        double sin=0;


        return sin;
    }

    /**
     * This method calculates cos(x)
     * Input: angle value
     * Return: cos value of x
     */
    public static double cos(double angle)
    {
        double cos=0;
        return cos;
    }

    /**
     * This method calculates tan(x)
     * Input: angle value
     * Return: tan value of x
     */
    public static double tan(double angle)
    {
        double tan=0;
        return tan;
    }

    /*
     * This method coverts Degree to Radian
     * Input: x deg
     * Return: returns x in radian
     */

    public static double DegToRad (double x)
    {
        return x ;
    }

    /*
     * This method normalizes radian to be between -2 PI and 2 PI
     * Input: x rad
     * Return: returns normalized radian
     */

    public static double normalizedRad (double x)
    {
        return x;
    }

    /*
     * This method calculates factorial
     * Input: n (any value)
     * Return: returns normalized radian
     */
    public static long factorial(int n)
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