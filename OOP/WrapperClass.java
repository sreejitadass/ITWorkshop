public class WrapperClass {
    public static void main(String[] args) {
        int x = 13;
        Integer i = Integer.valueOf(x);
        System.out.println("Boxing=" + i);
        i = x;
        System.out.println("Auto-boxing=" + i);

        Integer j = 20;
        int y = j.intValue();
        System.out.println("\nUnboxing=" + y);
        y = j;
        System.out.println("Auto-unboxing=" + y);
    }
}
