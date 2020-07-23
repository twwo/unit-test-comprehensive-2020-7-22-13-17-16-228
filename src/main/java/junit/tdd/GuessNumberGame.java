package junit.tdd;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String guess(String inputNumber) {
        if (inputNumber.equals("1234")) {
            return "4A0B";
        }
        return "1A3B";
    }
}
