package View;

import Model.ComplexNumber;

public class View {

    private ComplexNumber resultСalculation;
    private String inputMessage;

    public View(ComplexNumber resultСalculation, String inputMessage) {

        this.resultСalculation = resultСalculation;
        this.inputMessage = inputMessage;
    }

    public static void outputMessage(ComplexNumber resultСalculation, String inputMessage){
        // Определяем какой знак между числами
        char sign = '-';
        if(resultСalculation.getImaginaryPart() > 0){sign = '+';}
        System.out.printf("%s двух комплексных чисел = %s %s %si %n",
                inputMessage,
                resultСalculation.getRealPart(),
                sign,
                Math.abs(resultСalculation.getImaginaryPart()));
    }
}
