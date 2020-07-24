package junit.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ValidTest {

    @Test
    void should_return_wrong_message_when_guess_given_12() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "12";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("Wrong Input,Input again", guessResult);
    }

    @Test
    void should_return_wrong_message_when_guess_given_1134() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "1134";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("Wrong Input,Input again", guessResult);
    }

    @Test
    void should_return_wrong_message_when_guess_given_abcd() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "abcd";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("Wrong Input,Input again", guessResult);
    }
}
