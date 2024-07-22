import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] b = a.split("\\.");
        boolean v = false;
        String j = "";
        int d[] = new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            d[i]=Integer.parseInt(b[i]);
        }
        if(b.length==4)
        {
            int count=0;
            for(int i=0;i<4;i++)
            {
                if(d[i]>=0 && d[i]<=255)
                {
                    count++;
                }
            }
            if(count==4)
            {
                if(d[0]>=0 && d[0]<=127)
                {
                    j+="Class A";
                    v=true;
                }
                else if(d[0]>=128 && d[0]<=191)
                {
                    j+="Class B";
                    v=true;
                }
                else if(d[0]>=192 && d[0]<=223)
                {
                    j+="Class C";
                    v=true;
                }
                else if(d[0]>=224 && d[0]<=239)
                {
                    j+="Class D";
                    v=true;
                }
                else if(d[0]>=240 && d[0]<=255)
                {
                    j+="Class E";
                    v=true;
                }
                
            }
        }
        if(v==false)
        {
            System.out.println("It is not valid IP");
        }
        else
        {
            System.out.println(j);
        }
    }
}
