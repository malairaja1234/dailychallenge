import java.lang.String;

import javax.lang.model.util.ElementScanner6;

public class day8_validpalindrome {

    public static void main(String s[])
    {
        boolean t=ch();
        System.out.println(t);
    }
    public static boolean ch()
    {  
        /*
        
        alphabet and digits are allowed

        Two pointer Approach
         * 
         */



        String str="Ma,8d_8Am:";
        int i=0;
        int j=str.length()-1;

        while(i<j)
        {
            if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)))
            {
                if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) return false;
                i++;
                j--;
            }
            else if(Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(j)))
            {
               if(str.charAt(i) != str.charAt(j)) return false;
               i++;
               j--;
            }
            else if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetter(str.charA mt(j)) && !Character.isDigit(str.charAt(j)))
            {
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
