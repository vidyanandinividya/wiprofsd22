import java.util.Arrays;
class BuubleSort
{
    public static void main(String []args)
    {
        int []data={3,5,-1,4,7};
        BuubleSort.bubble(data);
        System.out.println(Arrays.toString(data));

    }
    static void bubble(int arr[])
    {
        int size=arr.length;

        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}