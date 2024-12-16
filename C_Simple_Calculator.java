import java.util.*;

public class C_Simple_Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a ,b;
        a = input.nextLong();
        b  = input.nextLong();

        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" - "+b+" = "+(a-b));
        input.close();
    }
}