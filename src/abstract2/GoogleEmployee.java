package javatrainning.abstract2;

public class GoogleEmployee extends Employee{
    private  String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void company() {
        System.out.println("Google");
    }
}
