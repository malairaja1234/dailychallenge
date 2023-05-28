import java.util.HashMap;

public class  day2_Twosum {
    public static void main(String s[] ) {
      int [] retans=twosum();
      System.out.println("Indexes are:");
      
     for (int i = 0; i < retans.length; i++) {
        System.out.print(retans[i]+" ");

     }
    
    }
    public static int[] twosum()
    {
        int arr[]={2,3,5,4,8,-1,7,9};
        int target=1;

        HashMap<Integer, Integer> map=new HashMap();
        for(int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement))
                return new int[]{i,map.get(complement)};
            map.put(arr[i],i);
        }
        return null;
    }

}
