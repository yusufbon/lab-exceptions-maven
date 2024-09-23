package edu.grinnell.csc207.util;

/**
 * Quadratic expressions (of the form ax^2 + bx + c).
 *
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 * @author YOUR NAME HERE
 */
public class Quadratic {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The coefficient of the x^2 component.
   */
  double a;

  /**
   * The coefficient of the x component.
   */
  double b;

  /**
   * The constant.
   */
  double c;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new quadratic.
   */
  public Quadratic(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  } // Quadratic(double, double, double)

  // +------------------+--------------------------------------------
  // | Standard Methods |
  // +------------------+

  /**
   * Convert to a string.
   *
   * @return the function as a string
   */
  public String toString() {
    return String.format("%dx^2 + %dx + %d", a, b, c);
  } // toString()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Build a string that shows the expression with a particular value.
   *
   * @return the expression as a string
   */
  public String toString(double val) {
    return String.format("%d*%d^2 + %d*%d + %d", a, val, b, val, c);
  } // toString(double)

  /**
   * Evaluate the quadratic on a value.
   *
   * @return the value
   */
  public double evaluate(double x) {
    return this.a * x * x + this.b * x + this.c;
  } // evaluate(double)

  /**
   * Find the smaller of the two roots.
   *
   * @return the smaller of the two roots (or the only root, if there
   *   is only one).
   */
  public double smallerRoot() {
    return 0; // STUB
  } // smallerRoot

  /**
   * Find the larger of the two roots.
   *
   * @return the larger of the two roots (or the only root, if there
   *   is only one).
   */
  public double largerRoot() {
    return 0; // STUB
  } // largerRoot
} // class Quadratic
