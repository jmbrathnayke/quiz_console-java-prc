public class QuestionService {

    Question[] questions = new Question[5];

    //constructor of questionservice
    public QuestionService(){
        questions[0] = new Question(1,"what is favourite language" ,"java" ,"python" ,"c" ,"c#","java");
        questions[1] = new Question(2,"what is favourite country" ,"srilanka" ,"india" ,"usa" ,"france","srilanka");
        questions[2] = new Question(3,"what is favourite color" ,"red" ,"blue" ,"black" ,"pink","black");
        questions[3] = new Question(4,"what is favourite tool" ,"vscode" ,"intelij" ,"figma" ,"pycharm","vscode");
        questions[4] = new Question(5,"what is favourite job roles" ,"software engineer" ,"cloud engineer" ,"devops" ,"sre","cloud engineer");
    }

    //methods
    public void displayQuestions(){
        //loop for get all values
        for(Question q : questions)
        System.out.println(q);
    }
}
