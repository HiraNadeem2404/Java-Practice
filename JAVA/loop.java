public class loop {
    public static void main(String a[]) {
        int x = 1;
        System.out.print("Before the Loop");
        while (x < 4) {
        System.out.print("In the loop");
        System.out.print("Value of x is " + x);
        x = x + 1;
        }
        System.out.print("This is after the loop");
    }
}