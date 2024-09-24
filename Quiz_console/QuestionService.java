import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] Selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of int", "1", "3", "5", "4", "4");
        questions[1] = new Question(2, "What is the size of double", "1", "8", "5", "4", "8");
        questions[2] = new Question(3, "What is the size of char", "1", "2", "5", "4", "2");
        questions[3] = new Question(4, "What is the size of boolean", "1", "3", "5", "4", "1");
        questions[4] = new Question(5, "What is the size of long", "1", "3", "8", "4", "8");

    }

    public void playquiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no:" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            Selection[i] = sc.nextLine();
           System.out.println("your answer:" + Selection[i] );
           System.out.println("_______________**______________");
            i++;
        }
        for(String s :Selection){
            System.out.println(s);
        }
    }

    public void printScore() {
        int Score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualanswer = que.getAnswer();
            String useranswer = Selection[i];

            if (actualanswer.equals(useranswer)) {
                System.out.println("Right");

                Score++;
            } else {
                System.out.println("wrong");
            }

        }
        System.out.println("Your Score is:" +Score);
    }

}
