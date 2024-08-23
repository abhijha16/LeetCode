import java.util.Scanner;

public class CHARHASH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        char[] arr = new char[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<5; i++)
        {
            arr[i] = sc.next().charAt(0);
        }

        int[] hash = new int[26];
        for(int i=0; i<n; i++)
        {
            
            hash[arr[i] - 'a'] += 1;
        }
        
        for(int i=0; i<26; i++)
        {
            System.out.println((char)(i + 'a') + " appears = " + hash[i]);
        }
        sc.close();

    }
}
