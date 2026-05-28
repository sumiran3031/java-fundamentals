public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("AND  (a & b): " + (a & b));
        System.out.println("OR   (a | b): " + (a | b));
        System.out.println("XOR  (a ^ b): " + (a ^ b));
        System.out.println("NOT  (~a): "    + (~a));
        System.out.println("Left shift  (a << 1): " + (a << 1));
        System.out.println("Right shift (a >> 1): " + (a >> 1));
    }
}