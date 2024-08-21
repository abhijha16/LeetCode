public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 9, 1 };
	Inner.bubble(arr);
	for (int i = 0; i < arr.length; i++)
	  {
		System.out.print (arr[i] + " ");
	  }
    }
}


class Inner{

    static void bubble(int[] arr)
	{
	  for (int i = 0; i < arr.length; i++)
		{
            boolean swap = false;
		  for (int j = 1; j < arr.length - i; j++)
			{
			  if (arr[j] < arr[j - 1])
				{
				  int temp = arr[j];
				  arr[j] = arr[j - 1];
				  arr[j - 1] = temp;
                  swap = true;
				}
			}
            if(swap == false)
            {
                break;
            }
		}
	}

    
}