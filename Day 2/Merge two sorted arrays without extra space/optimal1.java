class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        //Using extra space
        
        long[] res = new long[arr1.length+arr2.length];
        int k = -1;
        for(int i = 0; i < arr1.length; i++)
        {
            res[++k] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++)
        {
            res[++k] = arr2[i];
        }
        
        Arrays.sort(res);
        k=-1;
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = res[++k];
        }
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = res[++k];
        }
    }
}