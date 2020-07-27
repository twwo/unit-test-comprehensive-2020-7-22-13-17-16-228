package junit.tdd;

public class InputGuessNumberValidator implements Validator {

    private String inputNumber;

    public InputGuessNumberValidator(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (!inputNumber.matches("-?[0-9]+(\\.[0-9]+)?")) {
            isValid = false;
        }
        if (inputNumber.length() != 4) {
            isValid = false;
        } else {
            for (char number : inputNumber.toCharArray()) {
                if (inputNumber.indexOf(number) != inputNumber.lastIndexOf(number)) {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
}
