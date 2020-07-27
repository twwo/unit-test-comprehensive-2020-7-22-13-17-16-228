package junit.tdd;

public class InputGuessNumberValidator implements Validator {

    private String inputGuessNumber;

    public InputGuessNumberValidator(String inputGuessNumber) {
        this.inputGuessNumber = inputGuessNumber;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (!inputGuessNumber.matches("-?[0-9]+(\\.[0-9]+)?")) {
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
}
