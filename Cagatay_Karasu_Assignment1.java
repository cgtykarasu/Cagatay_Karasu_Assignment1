import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * @author Cagatay KARASU
 * @since 27.11.2020
 */

public class Cagatay_Karasu_Assignment1 {

    public static void main(String[] args) {

        int myScore = 0;
        int compScore = 0;
        int round = 1;

        showMessageDialog(null, "The first player who reaches 5 points wins.", "Let's Start!", INFORMATION_MESSAGE);

        while (compScore !=5 && myScore !=5) {

            String myChoice = showInputDialog(null, "Your Score = " + compScore + " - My Score = " + myScore + "\nRock, Scissor or Paper?", "Round : " + round, INFORMATION_MESSAGE);

            myChoice = myChoice.toLowerCase();

            if (!myChoice.equals("rock") && !myChoice.equals("scissor") && !myChoice.equals("paper")) {
                showMessageDialog(null, "Wrong move!", "ERROR!", WARNING_MESSAGE);
            }

            int rand = (int) (Math.random() * 3);

            String compChoice = null;

            int randNumber = (int) (Math.random() * 3);

            switch (randNumber) {

                case 0:
                    compChoice = "rock";
                    break;

                case 1:
                    compChoice = "scissor";
                    break;

                case 2:
                    compChoice = "paper";
                    break;
            }

            if (myChoice.equals(compChoice)) {

                showMessageDialog(null, "It's a tie!", "Message", INFORMATION_MESSAGE);
                round++;
            }

            else if (myChoice.equals("rock") && compChoice.equals("scissor")) {

                showMessageDialog(null, "My answer is rock. Rock breaks scissors. You lose!!", "Message", INFORMATION_MESSAGE);
                myScore++;
                round++;
            }

            else if (myChoice.equals("scissor") && compChoice.equals("paper")) {

                showMessageDialog(null, "My answer is scissor. Scissor cuts paper. You lose!!", "Message", INFORMATION_MESSAGE);
                myScore++;
                round++;
            }

            else if (myChoice.equals("paper") && compChoice.equals("rock")) {

                showMessageDialog(null, "My answer is paper. Paper eats rock. You lose!!", "Message", INFORMATION_MESSAGE);
                myScore++;
                round++;
            }

            else if (compChoice.equals("rock") && myChoice.equals("scissor")) {

                showMessageDialog(null, "My answer is rock. Rock breaks scissors. You win!!", "Message", INFORMATION_MESSAGE);
                compScore++;
                round++;
            }

            else if (compChoice.equals("scissor") && myChoice.equals("paper")) {

                showMessageDialog(null, "My answer is scissor. Scissor cuts paper. You win!!", "Message", INFORMATION_MESSAGE);
                compScore++;
                round++;
            }

            else if (compChoice.equals("paper") && myChoice.equals("rock")) {

                showMessageDialog(null, "My answer is paper. Paper eats rock. You win!!", "Message", INFORMATION_MESSAGE);
                compScore++;
                round++;
            }
        }

        if (myScore == 5) {

            showMessageDialog(null, "I Win!", "Message", INFORMATION_MESSAGE);
        }

        else
            showMessageDialog(null, "Congrats! You Win!", "Message", INFORMATION_MESSAGE);
    }

}
