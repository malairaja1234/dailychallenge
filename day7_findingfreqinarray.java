import java.util.HashMap;
public class day7_findingfreqinarray {
    public static void main(String s[])
    {
        int arr[]={2,2,5,7,4,4,8,9,10,2,3,5,3,2,8};
        HashMap < Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++)
        {

            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            
        }
        System.out.println(map);
    }
}
