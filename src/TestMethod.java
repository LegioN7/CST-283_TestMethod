// CST-283
// Aaron Pelto
// Winter 2024

// Write a method evenlySpaced that will return true if the three values are evenly spaced
// (so the difference between small and medium is the same as the difference between medium and large).
// The input parameters arrive in any order, but again they are all three different values.
public class TestMethod
{
    public static void main(String[] args)
    {
        // Test calls to method
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
    }

    // This method receives three different integers, a, b, c.  One of them is small, one is medium,
    // and one is large. The input parameters arrive in any order, but again they are all three different values.
    // The method will return true if the three values are evenly spaced, so the difference between small
    // and medium is the same as the difference between medium and large.
    public static boolean evenlySpaced(int a, int b, int c) {
        int min, mid, max;

        if (a > b) {
            if (a > c) {
                max = a;
                mid = Math.max(b, c);
                min = Math.min(b, c);
            } else {
                max = c;
                mid = a;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                mid = Math.max(a, c);
                min = Math.min(a, c);
            } else {
                max = c;
                mid = b;
                min = a;
            }
        }

        return mid - min == max - mid;
    }

}