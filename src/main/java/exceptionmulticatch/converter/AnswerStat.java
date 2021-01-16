package exceptionmulticatch.converter;

import java.util.ArrayList;
import java.util.List;


public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public double answerTruePercent(String answers) {
        boolean[] array = binaryStringConverter.binaryStringToBooleanArray(answers);
        double trueAnswers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                trueAnswers = trueAnswers + 1;
            }
        }
        double result = (trueAnswers / array.length) * 100;
        return result;
    }

    public boolean[] convert(String text) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(text);
        } catch (NullPointerException | IllegalArgumentException e){
            throw new InvalidBinaryStringException(e);
        }
    }
}
