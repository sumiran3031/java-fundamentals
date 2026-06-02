public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Full");
        sb.append(" Stack");
        sb.append(" Java");
        System.out.println("Built string: " + sb);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder()
                .append("Day ")
                .append(6)
                .append(" - Strings");
        System.out.println("Chained: " + sb2);
        System.out.println("Reversed: " + sb2.reverse());
    }
}
