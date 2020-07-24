package junit.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberGameTest {

    GuessNumberGame guessNumberGame;
    AnswerGenerator answerGenerator;

    @BeforeEach
    void setUp() {
        answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");
        String answer = answerGenerator.generateAnswer();
        guessNumberGame = new GuessNumberGame(answer);
    }

    @Test
    void should_return_4A0B_when_guess_given_1234_and_answer_is_1234() {
        //given
        answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");
        String answer = answerGenerator.generateAnswer();
        guessNumberGame = new GuessNumberGame(answer);
        String inputNumber = "1234";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("4A0B", guessResult);
    }

    @Test
    void should_return_1A3B_when_guess_given_1423_and_answer_is_1234() {
        //given
        answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");
        String answer = answerGenerator.generateAnswer();
        guessNumberGame = new GuessNumberGame(answer);
        String inputNumber = "1423";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("1A3B", guessResult);
    }

    @Test
    void should_return_0A0B_when_guess_given_5678_and_answer_is_1234() {
        //given
        String inputNumber = "5678";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A0B", guessResult);
    }

    @Test
    void should_return_1A1B_when_guess_given_1782_and_answer_is_1234() {
        //given
        String inputNumber = "1782";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("1A1B", guessResult);
    }

    @Test
    void should_return_0A4B_when_guess_given_4321_and_answer_is_1234() {
        //given

        String inputNumber = "4321";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A4B", guessResult);
    }

    @Test
    void should_return_0A2B_when_guess_given_4378_and_answer_is_1234() {
        //given

        String inputNumber = "4378";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A2B", guessResult);
    }

}
