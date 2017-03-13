
/**
 * Creates and plays a game of tic tac toe. 
 * 
 * @author Juan Valenzuela 
 * @version 02.08.2016
 */
public class TicTacToeGame
{
    //this program uses a 2d array 
    private String[][] game;
    private TicTacToeView gameInterface;

    /**
     * Constructor for objects of class TicTacToeGame
     */
    public TicTacToeGame()
    {
        game = new String[3][3]; //creates a 3x3 grid
        gameInterface = new TicTacToeView(this);
    }

    /**
     * changes all the squares in the Tic-Tac-Toe grid to ' '.
     */
    public void reset()
    {
        for(int row=0; row<game.length; row++)
        {
            for(int column=0; column<game.length; column++)
            {
                game[row][column] = " ";
            }
        }
    }
    
    /**
     * @param String location
     * Expected parameters:
     *  UPPER LEFT, UPPER CENTER, UPPER RIGHT
     *  CENTER LEFT, CENTER CENTER, CENTER RIGHT
     *  LOWER LEFT, LOWER CENTER, LOWER RIGHT
     * @param String mark : "X" or "O"
     */
    public boolean markSquare(String location, String mark)
    {
        boolean successful=false;
        if(mark.equals("X") || mark.equals("O"))
        {
            if(location.equals("UPPER LEFT"))
            {
                if(game[0][0].equals(" "))
                {
                    game[0][0]=mark;
                    successful=true;
                }
            }
            else if(location.equals("UPPER CENTER"))
            {
                if(game[0][1].equals(" "))
                {
                    game[0][1]=mark;
                    successful=true;
                }
            }
            else if(location.equals("UPPER RIGHT"))
            {
                if(game[0][2].equals(" "))
                {
                    game[0][2]=mark;
                    successful=true;
                }
            }
            else if(location.equals("CENTER LEFT"))
            {
                if(game[1][0].equals(" "))
                {
                    game[1][0]=mark;
                    successful=true;
                }
            }
            else if(location.equals("CENTER CENTER"))
            {
                if(game[1][1].equals(" "))
                {
                    game[1][1]=mark;
                    successful=true;
                }
            }
            else if(location.equals("CENTER RIGHT"))
            {
                if(game[1][2].equals(" "))
                {
                    game[1][2]=mark;
                    successful=true;
                }
            }
            else if(location.equals("LOWER LEFT"))
            {
                if(game[2][0].equals(" "))
                {
                    game[2][0]=mark;
                    successful=true;
                }
            }
            else if(location.equals("LOWER CENTER"))
            {
                if(game[1][0].equals(" "))
                {
                    game[2][1]=mark;
                    successful=true;
                }
            }
            else if(location.equals("LOWER RIGHT"))
            {
                if(game[2][2].equals(" "))
                {
                    game[2][2]=mark;
                    successful=true;
                }
            }
            else
            {
                System.out.println("Error: invalid location. Please enter one of the following.");
                System.out.println("UPPER LEFT, UPPER CENTER, UPPER RIGHT");
                System.out.println("CENTER LEFT, CENTER CENTER, CENTER RIGHT");
                System.out.println("LOWER LEFT, LOWER CENTER, LOWER RIGHT");                
            }
        }
        else
        {
            System.out.println("Error: invalid mark. Please enter X or O.");
        }
        return(successful);
    }
    
    /**
     * checks to see whether or not someone has won the game.
     */
    public boolean checkWinner()
    {
        boolean winner=false;        
        //if X wins
        if((game[0][0].equals("X") && game[0][1].equals("X") && game[0][2].equals("X"))
            ||
           (game[1][0].equals("X") && game[1][1].equals("X") && game[1][2].equals("X"))
            ||
           (game[2][0].equals("X") && game[2][1].equals("X") && game[2][2].equals("X"))
           ||
           (game[0][0].equals("X") && game[1][0].equals("X") && game[2][0].equals("X"))
           ||
           (game[0][1].equals("X") && game[1][1].equals("X") && game[2][1].equals("X"))
           ||
           (game[0][2].equals("X") && game[1][2].equals("X") && game[2][2].equals("X"))
           ||
           (game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X"))
           ||
           (game[0][2].equals("X") && game[1][1].equals("X") && game[2][0].equals("X")))
        {
            winner = true;
        }
        
        //if O wins
        if((game[0][0].equals("O") && game[0][1].equals("O") && game[0][2].equals("O"))
            ||
           (game[1][0].equals("O") && game[1][1].equals("O") && game[1][2].equals("O"))
            ||
           (game[2][0].equals("O") && game[2][1].equals("O") && game[2][2].equals("O"))
           ||
           (game[0][0].equals("O") && game[1][0].equals("O") && game[2][0].equals("O"))
           ||
           (game[0][1].equals("O") && game[1][1].equals("O") && game[2][1].equals("O"))
           ||
           (game[0][2].equals("O") && game[1][2].equals("O") && game[2][2].equals("O"))
           ||
           (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O"))
           ||
           (game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")))
        {
            winner = true;
        }
        return(winner);
    }    
}
