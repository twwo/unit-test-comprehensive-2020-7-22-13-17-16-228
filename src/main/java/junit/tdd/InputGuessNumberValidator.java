package junit.tdd;

public class InputGuessNumberValidator implements Validator {

    private static final String NUMBER_ONLY_PATTERN = "-?[0-9]+(\\.[0-9]+)?";

    private String inputGuessNumber;

    public InputGuessNumberValidator(String inputGuessNumber) {
        this.inputGuessNumber = inputGuessNumber;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (!isAllNumber(inputGuessNumber)) {
            isValid = false;
        }
        if (!isFormatRight(inputGuessNumber)) {
            isValid = false;
        }
        return isValid;
    }

    private boolean isAllNumber(String numbers) {
        return numbers.matches(NUMBER_ONLY_PATTERN);
    }

    private boolean isFormatRight(String numbers) {
        if (numbers.length() != 4) {
            return false;
        }
        for (char number : numbers.toCharArray()) {
            if (numbers.indexOf(number) != numbers.lastIndexOf(number)) {
                return false;
            }
        }
        return true;
    }
}
