public class typecasting {
    public static void main(String[] args) {
        double a = 15.155;
        int n = (int)a;
        a = n;
        System.out.println("a = " + a);
        System.out.println("n = " + n);
        String s = "142405";
        int m = Integer.parseInt(s);
        System.out.println(m);
    }

}
