package com.stackroute;

public class q6 {


    public static String[] tellno(String par)
    {
        String goodp[]=new String[2];
        for(int ip=0;ip<100;ip++)
    {
        long mm=factf(ip);

        if(mm>Integer.MAX_VALUE/2)
        {
            System.out.println(ip);
            goodp[0]=Integer.toString(ip);
            break;
        }

    }

        for(int il=0;il<100;il++)
        {
            long mn=factf(il);

            if(mn>Long.MAX_VALUE/10)
            {
                System.out.println(il);
                goodp[1]=Integer.toString(il);
                break;
            }

        }
    return goodp;}

    public static long factf(int n)
    {
        int i;
        long result=1;
        for(i=n;i>1;i--)
        {
            result=result*i;
        }
        return result;
    }

}
