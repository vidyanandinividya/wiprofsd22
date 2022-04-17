class LinearSearchDemo
{
    public static void main(String []args)
    {
        int data[]={2,4,6,5,3};
        int element=6;
        int result=linearsearch(data,element);
        if(result== -1)
        {
            System.out.println("Element not found");
            
        }
        else
        {
            System.out.println("Element found at index:"+result);
        }
    }
    static int linearsearch(int arr[],int element)
    {
        int size=arr.length;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==element)
            return i;
        }
        return -1;
    }
}