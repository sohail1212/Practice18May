package javatrainning.inheritance;

public class MainSoftware {
    public static void main (String [] args ) {
        Software s=new Software();
        s.setBackend("back");
        s.setFrontend("Nice");
        s.setRating(5);
        System.out.println(s.backend);
        System.out.println(s.frontend);
        System.out.println(s.rating);
        System.out.println("++++++++++++++++++");

        Cognizant c= new Cognizant();
//        c.setNoticeperiod();
    }
}
