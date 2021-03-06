package junit.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WholeGuessGameTest {
    @Test
    void should_return_sixth_answer_when_play_guessnumbergame_given_six_set_of_number() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator().generateAnswer());
        List<String> inputNumberList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            inputNumberList.add("1234");
        }

        //when
        List<String> resultList = guessNumberGame.play(inputNumberList);

        //then
        assertEquals(6, resultList.size());
    }
}
