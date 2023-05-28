import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class day4_topkfrequentelements {
    public static void main(String s[])
    {
        int a[]=new int[100];
        a=freq();
        System.out.println();
    }
    public static int[] freq()
    {
        int arr[]={4,3,6,7,7,2,1,9};
        int k=5;

        HashMap<Integer, Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
            map.put(arr[i],1);
            }
            
        }
        System.out.println(map);

        HashMap<Integer, List<Integer>> revmap=new HashMap();

        for (int i : map.keySet())
        {
          int count=map.get(i);
          if(!revmap.containsKey(count)) revmap.put(count,new ArrayList<Integer>());
          revmap.get(count).add(i);

        }

        System.out.println(revmap);

        int result[]=new int[k];
        int index=0;

        for(int i=arr.length;i>=1;i--)
        {
            if(revmap.containsKey(i))
            {
                for(int n:revmap.get(i))
                {
                    if(index <k)
                    {
                        result[index++]=n;
                    }
                    else
                    {
                        break;
                    }
                }
            }
           if(index>=k)
           {
                break;
           }
        }
        return result;
    }
}
