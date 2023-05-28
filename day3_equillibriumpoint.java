public class day3_equillibriumpoint {
    public static void main(String s[])
    {
        int ans=eqlbm();
        System.out.printf("eql point is: %d index",ans);
    }
    public static int eqlbm()
    {
        int arr[]={1,3,5,2,2};

        int lsum=0;
        int rsum=0;
        int equl;
        for(int i=0;i<arr.length;i++)
        {
            rsum=rsum+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            rsum=rsum-arr[i];
            if(lsum==rsum)
            {
                return i;
            }
            lsum=lsum+arr[i];
        }
        return -1;
    }
}
