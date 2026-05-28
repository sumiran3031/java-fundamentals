public class TypeCasting {
    public static void main(String[] args) {
        int i = 100;
        double d = i;
        System.out.println("Widening int to double: " + d);
        double x = 9.78;
        int y = (int) x;
        System.out.println("Narrowing double to int: " + y);
        char ch = 'A';
        int ascii = ch;
        System.out.println("Char to int (ASCII): " + ascii);
    }
}