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
}
