import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    // Add your code here
    public Difference(int[] e) {
        elements = e;
        maximumDifference = 0;
    }

    public void computeDifference() {
        for (int j = 0; j < elements.length; ++j)
            for (int i = 0; i < elements.length; ++i) {
                int min , a = elements[i] , b = elements[j] , max;
                if (a >= b)
                    max = a - b;
                else
                    max = b - a;
                if (max >= maximumDifference)
                    maximumDifference = max;
            }
    }
} // End of Difference class

public class Solution {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
          a[i] = sc.nextInt();
      }
      sc.close();

      Difference difference = new Difference(a);

      difference.computeDifference();

      System.out.print(difference.maximumDifference);
  }
}
