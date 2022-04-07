package chapterFive;

public class GlobalWarmingFactsQuizQuestions {
    String prompt;
    String answer;

    public GlobalWarmingFactsQuizQuestions(String prompt, String answer){
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return prompt;
    }
}

