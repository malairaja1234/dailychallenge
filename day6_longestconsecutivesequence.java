import java.util.HashSet;

public class day6_longestconsecutivesequence {
    public static void main(String s[])
    {
        int arr[]={7,6,10,4,3,2,1,15,8};
        HashSet<Integer> set=new  HashSet();
        int currlen=0;
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            if(set.contains(num-1)) continue;

            int length=0;
            while(set.contains(num))
            {
                currlen++;
                num++;
            }
            max=Math.max(currlen,max);
        }
        System.out.print("The max Length is: ");
        System.out.print(max);
    }
}
