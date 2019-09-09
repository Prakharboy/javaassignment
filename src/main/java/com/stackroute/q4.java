package com.stackroute;

public class q4 {

    public  static String  isseven(int nu)
    {
        if(nu%2==0)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
    public static String iseven(String numm)
    {
    int yy=Integer.parseInt(numm);

        return  isseven(yy);


    }


}