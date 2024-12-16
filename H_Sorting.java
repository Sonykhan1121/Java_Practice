import java.util.*;
public class H_Sorting{
    public static void selection_sort(int ar[])
    {
        for(int i =0;i<ar.length;i++)
        {
            int minvalue = ar[i];
            for(int  j = i+1;j<ar.length;j++)
            {
                if(minvalue >ar[j])
                {
                    int temp = minvalue;
                    minvalue = ar[j];
                    ar[j] = temp;
                }
            }
            int temp = minvalue;
            minvalue = ar[i];
            ar[i] = temp;
        }
        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n;
        n = input.nextInt();
        int ar[] = new int[n];
        for(int i =0;i<n;i++)
        {
            ar[i] = input.nextInt();
        }

        selection_sort(ar);

        for(int i =0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }


        input.close();



    }
}