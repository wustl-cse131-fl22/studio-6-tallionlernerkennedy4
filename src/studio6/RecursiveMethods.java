package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if ( n > 0 ) {
			return 1 / Math.pow(2, n)  + geometricSum(n-1);
		}
		else {
			return 0;	
		}	
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {		
		if ( p % q == 0) {
			return q;
		}
		else {
			int i = q - 1;
			if (p % i == 0 && q % i == 0) {
				return i;
			}
			else {
				gcd(p, q-1);
			}
		}

	}



	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {

		// FIXME create a helper method that can recursively reverse the given array
		return new int[0];

	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {

		// FIXME
		double bound = 5.0;
		StdDraw.setXscale(-bound,bound);
		StdDraw.setYscale(-bound,bound);

		if (radius > radiusMinimumDrawingThreshold) {
		StdDraw.circle(xCenter, yCenter, radius);
		double oldRadius = radius;
		radius /= 3;
		circlesUponCircles(-oldRadius, yCenter, radius, radiusMinimumDrawingThreshold);
		circlesUponCircles(oldRadius, yCenter, radius, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, -oldRadius, radius, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, oldRadius, radius, radiusMinimumDrawingThreshold);
		
		}
	}
}
