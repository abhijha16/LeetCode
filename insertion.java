import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[]  a = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<a.length - 1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(a[j - 1] > a[j])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("---Elements---");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();

    }
}
