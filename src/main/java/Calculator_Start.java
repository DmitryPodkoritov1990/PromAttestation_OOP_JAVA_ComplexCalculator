import Model.DivisionCalculation;
import Model.MultiplCalculation;
import Model.SummaCalculation;
import Model.rasnostCalculation;
import Presenter.Presenter;
import View.View;

public class Calculator_Start {
    public static void main(String[] args) {
        Presenter summ = new Presenter(new SummaCalculation(), new View());
        Presenter rasnost = new Presenter(new rasnostCalculation(), new View());
        Presenter division = new Presenter(new DivisionCalculation(), new View());
        Presenter multi = new Presenter(new MultiplCalculation(), new View());
        System.out.println("Сумма чисел: ");
        summ.ButtonClik();
        System.out.println();
        System.out.println("Разность чисел: ");
        rasnost.ButtonClik();
        System.out.println();
        System.out.println("Частное чисел: ");
        division.ButtonClik();
        System.out.println();
        System.out.println("Произведение чисел: ");
        multi.ButtonClik();

    }
}


