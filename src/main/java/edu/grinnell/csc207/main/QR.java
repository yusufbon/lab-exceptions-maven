package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    pen.print("Please input integers for the quadratic equation a * x^2 + b * x + c.\n");
    int a = IOUtils.readInt(pen, eyes, "Please enter an integer for coefficient a: ");
    int b = IOUtils.readInt(pen, eyes, "Please enter an integer for coefficient b: ");
    int c = IOUtils.readInt(pen, eyes, "Please enter an integer for coefficient c: ");

    Quadratic e = new Quadratic(a,b,c);
    pen.printf("The lower root of equation %s is %f\n", e.toString(), e.smallerRoot());

    eyes.close();
    pen.close();
  } // main(String[])

} // QR
