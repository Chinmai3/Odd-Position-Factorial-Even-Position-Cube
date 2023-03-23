import java.util.*;
import java.util.stream.Collectors; 
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
            al.add(sc.nextInt());
        }
        System.out.println(al.stream().map(ele->ref(ele)).collect(Collectors.toList()));
    }
    static int ref(int a)
    {
        if(a%2==0)
        {
        int p=1;
        for(int i=1;i<=a;i++)
        {
            p*=i;
        }
        return p;
        }
        else{
            return (a*a*a);
        }
    }
}
