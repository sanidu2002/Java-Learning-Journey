public class increment {
    public static void main(String[] args) {
        int x = 10;
        int y = x++; // Post-increment: y gets the value of x (10), then x is incremented to 11
        System.out.println(y); // This will print 10
        System.out.println(x); // This will print 6

        int a = 10;
        int b = ++a; // Pre-increment: a is incremented to 11, then b gets the value of a (11)
        System.out.println(b); // This will print 11
        System.out.println(a); // This will print 11


        int c = 10; //decrement
        c--;
        System.out.println(c); // This will print 9

    }
}
