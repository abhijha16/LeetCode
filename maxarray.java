import java.util.Scanner;


public class maxarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }

        int max = a[0];
        int smax=0;

        for(int i=1; i<a.length; i++)
        {
            if(max < a[i])
            {
                smax = max;
                max = a[i];
            }
        }
        System.out.println("The Secondlargest element is "+smax);
        System.out.println("The largest element is "+max);
        sc.close();
    }

}
