import Model.CalculatorComplexNumber;
import Model.ComplexNumber;

public class Main {

    public static void main(String[] args) throws Exception{


        ComplexNumber a = new ComplexNumber(-2, 1);

        ComplexNumber b = new ComplexNumber(1, -1);

        CalculatorComplexNumber.addComplexNumber(a, b); // Сложение

        CalculatorComplexNumber.multiplyComplexNumber(a, b); // Умножение

        CalculatorComplexNumber.divideComplexNumber(a, b); // Деление

    }
}
