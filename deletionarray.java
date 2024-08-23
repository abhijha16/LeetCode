import java.util.Arrays;
import java.util.Scanner;

public class deletionarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n =sc.nextInt();

        System.out.println("enter elemenmts: ");
        int a[]= new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Element index you want to delete: ");
        int index=sc.nextInt();

        for(int i=index; i<a.length-1; i++)
        {
            a[i] = a[i + 1];

        }
        n--;
        int[] newArray = Arrays.copyOf(a, n);
        System.out.println(Arrays.toString(newArray));
        sc.close();
    }
}
