import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s;
        s = input.nextLine();//for whole line
        s = input.next();//for one word
        System.out.println("THis is your string : "+s);
    }
}
