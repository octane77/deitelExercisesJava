//5.31 (Global Warming Facts Quiz) The controversial issue of global warming has been widely
//publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
//and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
//Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
//about man-made climate change.” Research both sides of the global warming issue online (you
//might want to search for phrases like “global warming skeptics”). Create a five-question multiplechoice
//quiz on global warming, each question having four possible answers (numbered 1–4). Be objective
//and try to fairly represent both sides of the issue. Next, write an application that administers
//the quiz, calculates the number of correct answers (zero through five) and returns a message to the
//user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if
//three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list
//of some of the websites where you found your facts.

package chapterFive;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        System.out.println("""
                \n
                Global Warming is one of the greatest threats to humanity.
                The following quiz gauges the general knowledge that you have about this global crisis.
                Do you understand this phenomenon?
                Take the Quiz and find out.
                x Do not look at the scoring sheet until you have completed all the questions.\s
                """);

        String q1 = """
                Which of the following is not an effect of global warming?
                1. Rising sea level\s
                2. Heat waves\s
                3. Expansion of deserts
                4. Inadequate supply of water
                """;

        String q2 = """
                Who among the following wrote a book on global warming?\s
                1. Wallace Smith Broecker
                2. David Wallace Stone\s
                3. Wallace Greg Craig
                4. Williams Daniel Marcus
                """;

        String q3 = """
                When did the history of climate change in science begin? In the early ______
                1. 20th century
                2. 19th century
                3. 18th century
                4. 17th century
                """;

        String q4 = """
                When was the greenhouse effect proposed?\s
                1. 1824
                2. 1826
                3. 1828
                4. 1830
                """;

        String q5 = """
                Who proposed the greenhouse effect?\s
                1. Joseph Fourier
                2. Eunice Newton Foote
                3. John Tyndall
                4. Svante Arrhenius
                """;

        GlobalWarmingFactsQuizQuestions[] questions = new GlobalWarmingFactsQuizQuestions[]{
                new GlobalWarmingFactsQuizQuestions(q1, "4"),
                new GlobalWarmingFactsQuizQuestions(q2, "1"),
                new GlobalWarmingFactsQuizQuestions(q3, "2"),
                new GlobalWarmingFactsQuizQuestions(q4, "1"),
                new GlobalWarmingFactsQuizQuestions(q5, "3")
        };

        takeTest(questions);
    }

    private static void takeTest(GlobalWarmingFactsQuizQuestions[] questions) {
        Scanner keyboardInput = new Scanner(System.in);
        int score = 0;

        for (GlobalWarmingFactsQuizQuestions question : questions) {
            System.out.println(question.prompt);
            String answer = keyboardInput.next();
            if (answer.equals(question.answer)) {
                score++;
            }
        }
        gradeQuiz(score);
    }


    private static void gradeQuiz(int score) {
        System.out.printf("\nYou scored %d%n", score);
        if (score == 5) {
            System.out.println("Excellent");
        }

        if (score == 5) {
            System.out.println("Excellent");
        } else if (score == 4) {
            System.out.println("Very good");
        } else if (score <= 3) {
            System.out.println("Time to brush up on your knowledge of global warming");
        }
    }
}