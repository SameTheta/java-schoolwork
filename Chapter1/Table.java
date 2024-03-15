public class Table {
    public static void main(String[] args) {
        int a = 1;

        System.out.println("a\ta^2\ta^3\ta^4");
        System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a) + "\t" + (a*a*a*a));
        a++;
        System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a) + "\t" + (a*a*a*a));
        a++;
        System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a) + "\t" + (a*a*a*a));
        a++;
        System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a) + "\t" + (a*a*a*a));
    }
}
