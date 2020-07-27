package junit.tdd;

import java.util.ArrayList;
import java.util.List;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String inputNumber) {
        return calculateAandB(inputNumber);
    }

    private String calculateAandB(String inputNumber) {
        if (!isValid(inputNumber)) {
            return "Wrong Input,Input again";
        }
        int aCount = 0;
        int bCount = 0;
        char[] inputNumbers = inputNumber.toCharArray();
        char[] answerNumbers = answer.toCharArray();
        for (int pos = 0; pos < inputNumbers.length; pos++) {
            if (answerNumbers[pos] == inputNumbers[pos]) {
                aCount++;
            }
            else if (isAnswerContains(inputNumbers[pos])) {
                bCount++;
            }
        }
        return aCount + "A" + bCount + "B";
    }

    private boolean isValid(String inputNumber) {
        Validator validator = new InputNumberValidator(inputNumber);
        return validator.validate();
//        boolean isValid = true;
//        if (!inputNumber.matches("-?[0-9]+(\\.[0-9]+)?")) {
//            isValid = false;
//        }
//        if (inputNumber.length() != 4) {
//            isValid = false;
//        } else {
//            for (char number : inputNumber.toCharArray()) {
//                if (inputNumber.indexOf(number) != inputNumber.lastIndexOf(number)) {
//                    isValid = false;
//                    break;
//                }
//            }
//        }
//        return isValid;
    }

    private boolean isAnswerContains(char inputNumber) {
        return answer.indexOf(inputNumber) != -1;
    }

    public List<String> play(List<String> inputNumberList) {
        List<String> resultList = new ArrayList<>();
        for (String inputNumber : inputNumberList) {
            resultList.add(guess(inputNumber));
        }
        return resultList;
     }
}
