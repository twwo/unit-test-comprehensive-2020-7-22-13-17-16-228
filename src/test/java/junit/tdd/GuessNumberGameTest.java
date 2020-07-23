package junit.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_given_1234_and_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "1234";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("4A0B", guessResult);
    }

    @Test
    void should_return_1A3B_when_guess_given_1423_and_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "1423";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("1A3B", guessResult);
    }

    @Test
    void should_return_0A0B_when_guess_given_5678_and_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "5678";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A0B", guessResult);
    }

    @Test
    void should_return_1A1B_when_guess_given_1782_and_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "1782";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("1A1B", guessResult);
    }
}
