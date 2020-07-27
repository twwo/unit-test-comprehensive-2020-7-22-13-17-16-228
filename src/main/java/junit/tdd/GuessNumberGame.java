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
        int positionRightAndNumberRightCount = 0;
        int positionWrongAndNumberRightCount = 0;
        char[] inputGuessNumberArrays = inputGuessNumebr.toCharArray();
        char[] answerNumbers = answer.toCharArray();
        for (int pos = 0; pos < inputGuessNumberArrays.length; pos++) {
            if (answerNumbers[pos] == inputGuessNumberArrays[pos]) {
                positionRightAndNumberRightCount++;
            }
            else if (isAnswerContains(inputGuessNumberArrays[pos])) {
                positionWrongAndNumberRightCount++;
            }
        }
        return positionRightAndNumberRightCount + "A" + positionWrongAndNumberRightCount + "B";
    }

    private boolean isValid(String inputGuessNumber) {
        Validator validator = new InputNumberValidator(inputGuessNumber);
        return validator.validate();
    }

    private boolean isAnswerContains(char inputGuessNumberArrays) {
        return answer.indexOf(inputGuessNumberArrays) != -1;
    }

    public List<String> play(List<String> inputGuessNumbers) {
        List<String> resultList = new ArrayList<>();
        for (String inputNumber : inputGuessNumbers) {
            resultList.add(guess(inputNumber));
        }
        return resultList;
     }
}
