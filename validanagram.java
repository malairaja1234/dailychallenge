public class arrayop
{
public static void main(String s[])
{

    //find Valid Anagram 

    String s1="raja";
    String s2="ajar";
    System.out.println(valid(s1,s2)); 
}
public static boolean valid(String s1,String s2)
{

    int arr[]=new int[26];
    for(char c:s1.toCharArray())
    {
        arr[c-'a']++;
    }

    for(char c:s2.toCharArray())
    {
        arr[c-'a']--;
    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=0)
        {
            return false;
        }
    }
    return true;
}
}