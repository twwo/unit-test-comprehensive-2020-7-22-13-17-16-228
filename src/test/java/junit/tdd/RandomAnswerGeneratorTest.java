package junit.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomAnswerGeneratorTest {
    @Test
    void should_return_valid_number_when_generate() {
        //given
        RandomAnswerGenerator answerGenerator = new RandomAnswerGenerator();

        //when
        String randomAnswer = answerGenerator.generateAnswer();
        Validator validator = new InputGuessNumberValidator(randomAnswer);

        //then
        assertTrue(validator.validate());
    }
}
