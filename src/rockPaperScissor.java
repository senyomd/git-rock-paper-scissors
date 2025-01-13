import java.util.Random;

//backend
public class rockPaperScissor {
    //all the choices that a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    //store the value of the computer so we can display it to the frontend
    private String computerChoice;

    //store the scores so we can display it to the frontend
    private int computerScores, playerScores;

    //use to generate a random number to randomly choose an option for the computer
    private Random random;

    //constructor - to initialize the random obj
    public rockPaperScissor(){
        random = new Random();
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScores() {
        return computerScores;
    }

    public int getPlayerScores() {
        return playerScores;
    }

    //call this method to begin playing rock paper scissors
    //playerChoice- is the choice made by the player(i.e. rock, paper, scissors)
    //this method will return the result of the game(i.e. computer win, player win, draw)
    public String playRockPaperScissors(String playerChoice) {
        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if (computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "Player Wins";
                playerScores++;
            } else if (playerChoice.equals("Scissors")) {
                result = "Computer Wins";
                computerScores++;
            } else {
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissors")) {
                result = "Player Wins";
                playerScores++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins";
                computerScores++;
            } else {
                result = "Draw";
            }
        } else {
            //computer chooses scissors
            if (playerChoice.equals("Rock")) {
                result = "Player Wins";
                playerScores++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer Wins";
                computerScores++;
            } else {
                result = "Draw";
            }
        }
        return result;
    }
}
