package junit.tdd;

import java.util.Random;

public class RandomAnswerGenerator implements AnswerGenerator {

    @Override
    public String generateAnswer() {
        Random random = new Random();
        StringBuilder answer = new StringBuilder();
        do {
            String randomNumber = String.valueOf(random.nextInt(10));
            if (!answer.toString().contains(randomNumber)) {
                answer.append(randomNumber);
            }
        } while (answer.length() != 4);
        return answer.toString();
    }
}
