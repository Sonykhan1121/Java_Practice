import java.util.*;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         long  n = input.nextLong();
        ArrayList<Long> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        result.add(n);
        while(n!=1)
        {

            if(n%2==0)
            {
                result.add(n/2);
                n/=2;
            }
            else
            {
                result.add(3*n+1);
                n=3*n+1;
            }
        }
        




        for(int i =0;i<result.size();i++)
        {
            output.append(result.get(i)).append(" ");
        }


       System.out.println(output.toString().trim());


        input.close();
        
    }
}
