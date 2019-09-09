package com.stackroute;

public class q2 {


public  static String checkpower(String pp) {

    int j = Integer.parseInt(pp);
    System.out.println(j);
    while (j > 4) {
        int rem=j%4;
        j = j / 4+rem;

    }
    if (j == 4)
    {return "yes";}
    else
    {return "no";}

}


}
