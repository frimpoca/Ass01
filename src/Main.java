import java.util.Scanner;

public class Main
{

    Scanner userInput=new Scanner(System.in);//USER INPUT FROM KEYBOARD
    String playAgain;//CHOICE TO PLAY AGAIN OR NOT

    public void StartGame(String playerAmove,String playerBmove)//GAME BEGAIN WITH USER INPUT PARAMETER
    {
        if(playerAmove.equals("R")||playerAmove.equals("r"))
        {
            if(playerBmove.equals("S")||playerBmove.equals("s"))
            {
                System.out.println("Rock breaks Scissors");
                System.out.println("playerA wins");
            }
            else if(playerBmove.equals("R")||playerBmove.equals("r"))
                System.out.println("Rock vs Rock it's a Tie! ");

            else
            {
                System.out.println("Paper covers Rock");
                System.out.println("playerB wins");
            }
        }
        else if(playerAmove.equals("P")||playerAmove.equals("p"))
        {
            if(playerBmove.equals("R")||playerBmove.equals("r"))
            {
                System.out.println("Paper covers Rock");
                System.out.println("playerA wins");
            }
            else if(playerBmove.equals("P")||playerBmove.equals("p"))
                System.out.println("Paper vs Paper it's a Tie! ");

            else
            {
                System.out.println("Scissors cuts Paper\n");
                System.out.println("playerB wins");
            }
        }
        else
        {
            if(playerBmove.equals("P")||playerBmove.equals("p"))
            {
                System.out.println("Scissors cuts Paper");
                System.out.println("playerA wins");
            }
            else if(playerBmove.equals("S")||playerBmove.equals("s"))
                System.out.println("Scissors vs Scissors it's a Tie! ");
            else
            {
                System.out.println("Rock breaks Scissors");
                System.out.println("playerB wins");
            }
        }



    }
    public void playerMove()
    {
        String playerAmove,playerBmove;//USER INPUT MOVE

        for(;;)//INFINITE LOOP FOR GAME CONTINUE TILL USER WANT
        {

            for(;;)//INFINITE LOOP TILL USER DO NOT ENTER CORRECT INPUT
            {
                System.out.println("Enter Move for player A");
                playerAmove=userInput.next();

                if(playerAmove.equals("R")||playerAmove.equals("P")||playerAmove.equals("S")    //CHECKS FOR VALID INPUT IF VALID INPUT THEN COME OUT OF LOOP
                        ||playerAmove.equals("r")||playerAmove.equals("p")||playerAmove.equals("s"))
                    break;
                else
                {
                    System.out.println("Enter a valid input(R or P or S or r or p or s");
                }
            }
            for(;;)
            {
                System.out.println("Enter Move for player B");
                playerBmove=userInput.next();

                if(playerBmove.equals("R")||playerBmove.equals("P")||playerBmove.equals("S")
                        ||playerBmove.equals("r")||playerBmove.equals("p")||playerBmove.equals("s"))
                    break;
                else
                {
                    System.out.println("Enter a valid input(R or P or S or r or p or s");
                }
            }
            StartGame(playerAmove,playerBmove);//START THE GAME WHEN CORRECT INPUT BY PLAYER A AND PLAYER B

            System.out.println("Do you like to play again(Y/N)");
            playAgain=userInput.next();//USER ENTER CHOICE TO PLAY AGAIN OR NOT

            if(!playAgain.equals("Y"))//IF PRESS Y THEN ONLY USER IS ALLOWEDE TO PLAY AGAIN ELSE BREAK THE LOOP
                break;
        }
    }
    public static void main(String[] args) //PROGRAM EXECUTION BEGAIN NOW
    {


        new Main().playerMove();//PLAYER OBJECT TO START THE GAME

        // TODO code application logic here
    }

}
