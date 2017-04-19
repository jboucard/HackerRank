import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int j=0;
            int e=0;
            int numb=0;
            while(j<n)
            {
                if(j==0)
                {
                    numb = a+b;
                }else{
                    if(e==0)
                    {
                        e=1;    
                    }
                    //I first thought that the nase of the exponent was the value of q
                    //but it is always 2
                    e *= 2;
                    
                    numb += e*b;
                }
                if(j==0)
                {
                    System.out.print(numb);    
                    //System.out.print(numb+"   a: "+a+", b: "+b+", n: "+n+", j: "+j+", e: "+e+"\n");    
                }else{
                    System.out.print(" "+numb);
                    //System.out.print(""+numb+"   a: "+a+", b: "+b+", n: "+n+", j: "+j+", e: "+e+"\n");
                }
                j++;
            }
            System.out.print("\n");
        }
        in.close();
    }
}