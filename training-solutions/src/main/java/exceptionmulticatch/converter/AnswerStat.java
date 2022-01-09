package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.converter = binaryStringConverter;
    }

    public int answerTruePercent(String answers) {
        boolean[] booleanArray = convert(answers);
        int numberOfTrue = 0;
        for (int j = 0; j < booleanArray.length; j++) {
            if (booleanArray[j]) {
                numberOfTrue++;
            }
        }
        return (int) Math.round((double) numberOfTrue / booleanArray.length * 100);
    }

    public boolean[] convert(String checkboxes) {
        try {
            return converter.binaryStringToBooleanArray(checkboxes);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }
}
