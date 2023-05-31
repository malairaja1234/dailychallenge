import javax.lang.model.util.ElementScanner6;

public class day5_unionandintersectionofarray {
    public static void main(String s[])
    {
        //for sorted array
       union();
       intersection();
    }
    public static void union()
    {
        int arr1[]={3,4,5,7,8,9,11};
        int arr2[]={4,6,13,16,18,20};
        //
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                System.out.println(arr2[j]);
                j++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<arr1.length)
        {
            System.out.println(arr1[i]);
            i++;
        }
        while(j<arr2.length)
        {
            System.out.println(arr2[j]);
            j++;
        }
        System.out.println("union completed");
    }

    public static void intersection()
    {
        int arr1[]={2,3,4,5,6,7,8,9,10,20};
        int arr2[]={3,4,8,12,15,20,24};

        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
        
    }
    
}
