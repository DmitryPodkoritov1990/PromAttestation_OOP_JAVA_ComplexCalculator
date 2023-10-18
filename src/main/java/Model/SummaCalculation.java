package Model;

public class SummaCalculation extends CalcModel{

    public SummaCalculation(){

    }
    @Override
    public double result() {
        return number1 + number2;
    }

    @Override
    public void setNumber1(double value) {
        super.number1 = value;

    }

    @Override
    public void setNumber2(double value) {
        super.number2 = value;
    }
}
