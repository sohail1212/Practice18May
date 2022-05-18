package javatrainning.abstract2;

public class CodexBoxEmployee extends Employee {

    private float percentile ;

    public float getPercentile() {
        return percentile;
    }

    public void setPercentile(float percentile) {
        this.percentile = percentile;
    }

    @Override
    public void company() {
        System.out.println("CodexBox");
    }
}
