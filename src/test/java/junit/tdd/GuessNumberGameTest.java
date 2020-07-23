package junit.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void should_return_0A4B_when_guess_given_4321_and_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "4321";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A4B", guessResult);
    }

    @Test
    void should_return_0A2B_when_guess_given_4378_and_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputNumber = "4378";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A2B", guessResult);
    }

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
    void should_return_sixth_answer_when_play_guessnumbergame_given_six_set_of_number() {
        //given
        AnswerGenerator answerGenerator = new RandomAnswerGenerator();
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        List<String> inputNumberList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            inputNumberList.add(answerGenerator.generateAnswer());
        }

        //when
        List<String> resultList = guessNumberGame.play(inputNumberList);

        //then
        assertEquals(6, resultList.size());
    }
}
