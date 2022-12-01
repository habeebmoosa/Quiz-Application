package com.basicproject.QuizApp;

import java.util.*;

public class mainQuiz {
    public static void main(String[] args) {

        Quiz q = new Quiz();
        q.logic();
    }
}

class Quiz {
    public void logic() {

        int correct = 0, wrong = 0;
        try (Scanner sc = new Scanner(System.in)) {
                QuestionsWithOptions q1 = new QuestionsWithOptions(
                        "Q.There was 25% off on handbags. Madhu bought a handbag. She also got a 10% discount for paying cash. She paid Rs. 405. What as the price tag on the handbag?",
                        "a. Rs. 575", "b. Rs. 625", "c. Rs. 450", "d. Rs. 600");
                QuestionsWithOptions q2 = new QuestionsWithOptions(
                        "Q.Neil started a business and Michael joined him after 2 months. Neil spent Rs. 30,000 while Michael spent Rs. 45,000. Their one year profit came out to Rs. 54000. How much profit will Neil get?",
                        "a. Rs. 24000", "b. Rs. 30000", "c. Rs. 27000", "d. Rs. 20000");
                QuestionsWithOptions q3 = new QuestionsWithOptions(
                        "Q.Paper charge is Rs. 60 per kg. How much expenditure would be there to cover a cube of edge 10m with a paper, if one kg of paper covers 20 sq.m. area?",
                        "a. Rs. 2250", "b. Rs. 3600", "c. Rs. 2700", "d. Rs. 1800");
                QuestionsWithOptions q4 = new QuestionsWithOptions(
                        "Q.54 toymakers can prepare 36 toys per day. Ajay wants 416 toys. How many toymakers should he employ to get the job done in 16 days?",
                        "a. 43", "b. 39", "c. 16", "d. 24");
                QuestionsWithOptions q5 = new QuestionsWithOptions(
                        "Q.Kabir paid Rs. 9600 as interest on a loan he took 5 years ago at 16% rate of simple interest. What was the amount he took as loan?",
                        "a. Rs. 16400", "b. Rs. 12000", "c. Rs. 12500", "d. Rs. 18000");
                QuestionsWithOptions q6 = new QuestionsWithOptions(
                        "Q.Sam borrowed some money from his friend at simple interest of 6% per annum. He returned his friend Rs. 15600. After how much time did Sam return the money if he borrowed Rs. 12000?",
                        "a. 8 years", "b. 2.5 years", "c. 5 years", "d. 3.5 years");
                QuestionsWithOptions q7 = new QuestionsWithOptions("Q.19.399 + 10.33 + 7.82 + 3.111 = ?", "a. 40.66", "b. 40.65",
                        "c. 90.856", "d. 40.566");
                QuestionsWithOptions q8 = new QuestionsWithOptions(
                        "Q.A cistern has two taps attached to it. Tap B can empty the cistern in 45 minutes. But Tap A can fill the cistern in just 30 minutes. Rohit started both taps unknowingly but realized his mistake after 30 minutes. He immediately closed Tap B. Now after this, in how much time will the cistern be filled?",
                        "a. 30 minutes", "b. 45 minutes", "c. 15 minutes", "d. 20 minutes");
                QuestionsWithOptions q9 = new QuestionsWithOptions(
                        "Q.Ramesh has a metal cube. He paints all sides of the cube with green color. He divides the cube into smaller cubes of volume 1 cu.m. each. How many of these smaller cubes will not have green color on even one of its sides if the volume of larger cube is 27 cu.m.?",
                        "a. 9", "b. 1", "c. 0", "d. 3");
                QuestionsWithOptions q10 = new QuestionsWithOptions(
                        "Q.20 girls can paint a house in 15 days. But the same house can be painted in just 10 days by 15 boys. If 10 boys and 10 girls are asked to work together, then in how many days will they complete the painting starting from scratch?",
                        "a. 30 minutes", "b. 45 minutes", "c. 15 minutes", "d. 10 days");

                Map<QuestionsWithOptions, Character> hm = new HashMap<>();
                hm.put(q1, 'd');
                hm.put(q2, 'a');
                hm.put(q3, 'd');
                hm.put(q4, 'b');
                hm.put(q5, 'b');
                hm.put(q6, 'c');
                hm.put(q7, 'a');
                hm.put(q8, 'd');
                hm.put(q9, 'b');
                hm.put(q10, 'd');

                System.out.println("_______________________Aptitude Quiz_______________________\n");
                System.out.println("There are total 10 questions, you need to attend all questions!\n");

                for (Map.Entry<QuestionsWithOptions, Character> map : hm.entrySet()) {
                    System.out.println(map.getKey().getQuestion());
                    System.out.println();
                    System.out.println(map.getKey().getOption1());
                    System.out.println(map.getKey().getOption2());
                    System.out.println(map.getKey().getOption3());
                    System.out.println(map.getKey().getOption4());
                    System.out.println();

                    System.out.print("Enter your choice: ");
                    Character choice = sc.next().charAt(0);
                   

                    int result = Character.compare(choice, map.getValue());

                    if (result == 0) {
                        correct++;
                    } else {
                        wrong++;
                    }

                }
        }

        System.out.println("_______________________Result_______________________");
        System.out.println();
        System.out.println("Correct answered questions: " + correct);
        System.out.println("Wrong answered questions: " + wrong);
        

    }
}

