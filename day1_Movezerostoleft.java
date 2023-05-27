public class day1_Movezerostoleft
{
    public static void main(String raja[]) {
      int arr[]={1,0,1,0,0,1,1,0};
      //here we are move all zeros to leftside
      //iterating the loop first
      int count=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==0)
        {
            count++;
        }
      }
      for(int i=0;i<count;i++)
      {
        arr[i]=0;
      }
      for (int i = count; i < arr.length; i++) {
        arr[i]=1;
      }
      //it is applicable only if contains two no of possiblities either {0,1}

      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
      
    }
}