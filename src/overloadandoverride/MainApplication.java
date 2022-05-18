package javatrainning.overloadandoverride;

import javatrainning.interface1.Hello;

public class MainApplication {

    public static void main (String [] args){
        OverridingA a = new OverridingB();
        System.out.println(a.calculate(3, .5f));

        Overload.sample(21,25);
        System.out.println(Hello.COMPANY_NAME);

        Overload.sample(123,12345687);

    }


}
