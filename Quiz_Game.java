import java.util.Scanner;

public class Quiz_Game {
    public static void main(String[] args) {
        String[] questions = {"What is the size of an int variable in Java?",
                              "Which of the following is not a Java keyword?",
                              "What is the default value of a boolean variable?",
                              "Which method is the entry point of a Java program?",
                              "Which of the following is used to create an object in Java?",
                              "Which of the following is not an OOP concept in Java?",
                              "What does JVM stand for?",
                              "Which operator is used for comparing two values in Java?",
                              "What is the extension of compiled Java bytecode files?",
                              "Which of the following is used to handle exceptions in Java?",};

        String[][] options = {{"1. 8 bits", "2. 16 bits", "3. 32 bits", "4. 64 bits"},
                              {"1. static", "2. Boolean", "3. void", "4. private"},
                              {"1. true", "2. false", "3. 0", "4. null"},
                              {"1. start()", "2. run()", "3. main()", "4. init()"},
                              {"1. class", "2. new", "3. alloc", "4. object"},
                              {"1. Encapsulation", "2. Inheritance", "3. Compilation", "4. Polymorphism"},
                              {"1. Java Virtual Method", "2. Java Verified Machine", "3. Java Virtual Machine", "4. Java Variable Method"},
                              {"1. =", "2. ==", "3. !=", "4. equals"},
                              {"1. .java", "2. .class", "3. .exe", "4. .obj"},
                              {"1. try-catch", "2. if-else", "3. for", "4. switch"}};


        int[] answers = {3, 2, 2, 3, 2, 3, 3, 2, 2, 1};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }       

            System.out.print("Enter your Guess: ");
            guess = sc.nextInt();

            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }
        System.out.println("Your Final Score is: " + score + " Out of " + questions.length);

        sc.close();
    }
}
