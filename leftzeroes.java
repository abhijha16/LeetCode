public class leftzeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }

        System.out.println(count);
        int j=arr.length - 1;
        for(int i=arr.length - 1; i>=0; i--)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j--;
            }
        }

        for(int i=0; i<count; i++)
        {
            arr[i] = 0;
        }
    
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("["+arr[i]+"] ");
        }
    }
}
