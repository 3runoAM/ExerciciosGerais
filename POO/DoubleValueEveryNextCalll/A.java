public class A {
    private static int number = 1;
    public static int getNumber() {
        int doubledNumber = number;
        number *= 2;
        return doubledNumber;
    }
}