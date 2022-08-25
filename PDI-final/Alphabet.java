import java.util.*;

public class Alphabet
{
    public static void main(String[] args)
    {
        char s;
        Scanner sc = new Scanner(System.in);
        char array[] = new char[3];
  
        for(int i = 0;i < array.length; i++)
        {
        System.out.println("Enter your letters?");
        s = sc.next().charAt(0);
        

      
        if(s >= 'A' && s <= 'Z' && s != '?')
        {
           array[i] = s;
        }
      
        
        }
        System.out.println(Arrays.toString(array));
     }
}


