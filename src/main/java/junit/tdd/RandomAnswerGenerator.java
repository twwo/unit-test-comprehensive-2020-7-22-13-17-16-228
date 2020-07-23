package junit.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAnswerGenerator implements AnswerGenerator {
    private List<Integer> numberSet;

    public RandomAnswerGenerator() {
        numberSet = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberSet.add(i);
        }
    }

    @Override
    public String generateAnswer() {
        Random random = new Random();
        String answer = "1234";
        return answer;
    }

    public static void main(String[] args) {
        AnswerGenerator answerGenerator = new RandomAnswerGenerator();
        System.out.println(answerGenerator.generateAnswer());
    }
}
