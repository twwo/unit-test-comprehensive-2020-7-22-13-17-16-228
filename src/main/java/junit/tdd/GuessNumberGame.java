package junit.tdd;

import java.util.ArrayList;
import java.util.List;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String inputGuessNumber) {
        return calculateAandB(inputGuessNumber);
    }

    private String calculateAandB(String inputGuessNumebr) {
        if (!isValid(inputGuessNumebr)) {
            return "Wrong Input,Input again";
        }
        int aCount = 0;
        int bCount = 0;
        char[] inputNumbers = inputGuessNumebr.toCharArray();
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

    private boolean isValid(String inputGuessNumber) {
        Validator validator = new InputNumberValidator(inputGuessNumber);
        return validator.validate();
//        boolean isValid = true;
//        if (!inputGuessNumber.matches("-?[0-9]+(\\.[0-9]+)?")) {
//            isValid = false;
//        }
//        if (inputGuessNumber.length() != 4) {
//            isValid = false;
//        } else {
//            for (char number : inputGuessNumber.toCharArray()) {
//                if (inputGuessNumber.indexOf(number) != inputGuessNumber.lastIndexOf(number)) {
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
