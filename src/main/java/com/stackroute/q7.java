
package com.stackroute;
public class q7 {

private String firstname,lastname;
private int salaryy,agee;


  public static String getname(String fn,String ln,String age,String salary) {

      q7 newhello =new q7();

      int agec=Integer.parseInt(age);
      int salaryc=Integer.parseInt(salary);

      newhello.sett(fn,ln,agec,salaryc);
      int cc=newhello.isvalid(agec);

      if(cc==0)
      {
          return "invalid age age should be in range 18-60";
      }
      if(cc==-1)
      {
          return "age cant be greater than 100 and less than 0";
      }

      return newhello.dispname();

  }

    public   String dispname()
    {
     return this.firstname;
    }

    public  void sett(String fnf,String lnf,int age,int salary)
    {
        this.firstname=fnf;
        this.lastname=lnf;
        this.agee=age;
        this.salaryy=salary;
    }

    public int isvalid(int agef)
    {
        if(agef>=100||agef<=0)
        {
            return -1;
        }

        if(agef<=60&&agef>=18)
        {
            return 1;
        }
        else
        return 0;
    }

}
