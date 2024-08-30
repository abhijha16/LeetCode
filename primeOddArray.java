import java.util.Scanner;

public class primeOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        int count =0;

        for(int i=1; i<=num; i++) {
            if(isPrime(i)) {
                count++;
            }
        }

        int[] arr = new int[count];
        int countt = 0;
        for(int i=1; i<=num; i++) {
            if(isPrime(i)) {
                arr[countt] = i;
                countt++;
            }
        }

        System.out.println("Prime Numbers");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
        System.out.println("Odd Place Array");
        for(int i=1; i<arr.length; i+=2) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {

        if(num == 1 || num == 0) {
            return false;
        }

        for(int i=2; i<= num/2; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
