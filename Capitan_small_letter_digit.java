import java.util.*;
public class Capitan_small_letter_digit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        ch = input.next().charAt(0);
        // System.out.println(ch);
        if((ch>='a' && ch<='z') || (ch>='A'&& ch<='Z'))
        {
            System.out.println("ALPHA");
            if(ch>='a' && ch<='z')
            {
                System.out.println("IS SMALL");

            }
            else
            {
                System.out.println("IS CAPITAL");
            }
        }
        else
        {
            System.out.println("IS DIGIT");
        }
        input.close();       
    }
}