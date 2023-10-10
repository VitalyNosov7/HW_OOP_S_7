package Model;

import View.View;
import java.io.FileInputStream;
import java.util.logging.*;

public class CalculatorComplexNumber {

    static Logger LOGGER;

    static {
        try(FileInputStream ins = new FileInputStream("./src/log.config")){ // полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(CalculatorComplexNumber.class.getName());
            }catch (Exception ignore){
            ignore.printStackTrace();
            LOGGER.info("Произведена операция над комплексными числами!");
            }
    }

    public static ComplexNumber addComplexNumber(ComplexNumber a, ComplexNumber b) {

        double realSum = a.getRealPart() + b.getRealPart();
        double imaginarySum = a.getImaginaryPart() + b.getImaginaryPart();

        ComplexNumber sum = new ComplexNumber(realSum, imaginarySum);

        View.outputMessage(sum, "Сумма");

        LOGGER.info("Суммировали комплексные числа!");

        return sum;
    }

    public static ComplexNumber multiplyComplexNumber(ComplexNumber a, ComplexNumber b) {


        double realProduct = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryProduct = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();

        ComplexNumber product = new ComplexNumber(realProduct, imaginaryProduct);

        View.outputMessage(product, "Произведение");

        LOGGER.info("Умножили комплексные числа!");

        return product;
    }

    public static ComplexNumber divideComplexNumber(ComplexNumber a, ComplexNumber b) {

        if (b.getRealPart() == 0 && b.getImaginaryPart() == 0) {

            throw new IllegalArgumentException("Деление на ноль невозможно!");

        }

        double realNumerator = a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryNumerator = a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart();
        double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double realQuotient = realNumerator / denominator;
        double imaginaryQuotient = imaginaryNumerator / denominator;

        ComplexNumber quotient = new ComplexNumber(realQuotient, imaginaryQuotient);

        View.outputMessage(quotient, "Частное");

        LOGGER.info("Разделили комплексные числа!");

        return quotient;
    }
}