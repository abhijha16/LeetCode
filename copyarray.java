
import java.util.Scanner;

public class copyarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter element you want to search: ");
        int x=sc.nextInt();

        int c=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == x)
            {
                c++;
                System.out.println("The element is present");
            }
        }

        if(c==0)
        System.out.println("The element is not present");

        sc.close();
    }
}
