package com.stackroute;

public class q3 {

    public static String doo(String tempp)
    {
        member_variables mk=new member_variables();

       return mk.doom(tempp);
    }

    public static class members {
        private String name;

        members(String naam) {
            this.name = naam;
        }

        public String disp() {
            return name;
        }


    }

    public static class member_variables {

        public String doom(String namx) {
            members mm = new members(namx);

           return mm.disp();
        }

    }
}