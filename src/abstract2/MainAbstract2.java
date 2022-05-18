package javatrainning.abstract2;

public class MainAbstract2 {
    public static void main(String[] args) {
        CodexBoxEmployee codexBoxEmployee=new CodexBoxEmployee();
        codexBoxEmployee.setEmpName("Sohail");
        codexBoxEmployee.setEmpId(202238);
        codexBoxEmployee.setEmpSalary("12000");
        codexBoxEmployee.setPercentile(4.5f);
        System.out.println(codexBoxEmployee.getEmpName());
        System.out.println(codexBoxEmployee.getEmpId());
        System.out.println(codexBoxEmployee.getEmpSalary());
        System.out.println(codexBoxEmployee.getPercentile());

        GoogleEmployee googleEmployee= new GoogleEmployee();
        googleEmployee.setEmpName("Sohail");
        googleEmployee.setEmpId(202238);
        googleEmployee.setEmpSalary("12000");
        googleEmployee.setPerformance("Good");
        System.out.println(googleEmployee.getEmpName());
        System.out.println(googleEmployee.getEmpId());
        System.out.println(googleEmployee.getEmpSalary());
        System.out.println(googleEmployee.getPerformance());

        codexBoxEmployee.company();
        googleEmployee.company();
    }
}
