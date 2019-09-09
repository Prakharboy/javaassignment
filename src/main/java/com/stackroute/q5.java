package com.stackroute;

public class q5 {


    public static String[] findall(int aaa[]) {
        int ll = aaa.length;

        if(ll==0)
        {
            String[] abc={"null","null","null"};
            return abc;
        }
        String[] io={"null","negative and greater than 100 not allowed"};

        for(int kk=0;kk<ll;kk++)
        {
            if(aaa[kk]<0||aaa[kk]>100)
            {
               return  io;
            }

        }
        int maxm = maxf(aaa, ll);
        int minm = minf(aaa, ll);
        int avgm = avgf(aaa, ll);

        String[] result=new String[3];

        result[0]=Integer.toString(minm);
        result[1]=Integer.toString(maxm);
        result[2]=Integer.toString(avgm);

        return result;

    }

    public static int maxf(int a[],int snum)
    {
        int i;
        int max=a[0];
        for(i=1;i<snum;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        return max;
    }

    public static int minf(int a[],int snum)
    {
        int i;
        int min=a[0];
        for(i=1;i<snum;i++)
        {
            if(min>a[i])
                min=a[i];
        }
        return min;
    }
    public static int avgf(int a[],int snum)
    {
        int i;
        int avg=0;
        for(i=0;i<snum;i++)
        {
            avg=avg+a[i];
        }
        return avg/snum;
    }

}
