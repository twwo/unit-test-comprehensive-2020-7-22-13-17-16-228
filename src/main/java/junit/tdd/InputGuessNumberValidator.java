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
        if (inputGuessNumber.length() != 4) {
            isValid = false;
        } else {
            for (char number : inputGuessNumber.toCharArray()) {
                if (inputGuessNumber.indexOf(number) != inputGuessNumber.lastIndexOf(number)) {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }

    private boolean isAllNumber(String numbers) {
        return numbers.matches(NUMBER_ONLY_PATTERN);
    }
}
