import java.util.Scanner;

public class missingnumberarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int sum = n * (n+1)/2;
        int k = missing(arr, sum);
        System.out.println("The Missing Element Is: "+k);

        sc.close();
    }

    public static int missing(int[] arr, int sum)
    {
        int missing = 0;
        for(int i=0; i<arr.length; i++)
        {
            missing = missing + arr[i];
        }

        return (sum - missing);
    }
}
