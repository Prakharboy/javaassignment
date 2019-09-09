package com.stackroute;

public class q1 {

 public static String checkpalin(String wordd)
 {
    StringBuilder tordd=new StringBuilder();
    tordd=tordd.append("");

    String kk="null";
    if(wordd.length()==0)
    {
        return kk;
    }

    tordd=tordd.append(wordd);
    tordd=tordd.reverse();
    String good=tordd.toString();


          if(good.equals(wordd))
            return "palindrome";
           else
        return "notpalindrome";}
}
