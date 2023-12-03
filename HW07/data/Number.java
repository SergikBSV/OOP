package data;

public class Number {
    private double number;

    public double add(double number){
        return  this.number+=number;
    }
    @Override
    public String toString() {
        return "Число{" +
                "число=" + number +
                '}';
    }

    public Number(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
