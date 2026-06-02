public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer sb = new java.lang.StringBuffer("Hello");
        sb.append(" Java");
        System.out.println("After append: " + sb);
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);
        sb.replace(6, 10, "World");
        System.out.println("After replace: " + sb);
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
