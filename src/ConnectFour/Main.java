
package ConnectFour;

import java.util.List;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

// API:
// {"grid": [[0, 0, 0], [0, 0, 0], [0, 0, 0]]}
// {"move":2}
         
// Rename to 'Driver'?
public class Main {
    
    //
    // --interpreter-1 <path>
    // --program-1 <path>
    //
    // --interpreter-2 <path>
    // --program-2 <path>
    //
    // If interpreter is not supplied, its program will be
    // interpreted as an executable (see what I did there?).
    // If the interpreter argument is used the program is
    // passed as an argument to it. The program args will
    // always be used.
    // 
    public static void main(String[] args) { 
        
        // Get these from command line arguments instead?
        final int height = 7;
        final int width = 8;
        
        Board board = new Board(height, width, 4);
        PlayerProcess p1;
        PlayerProcess p2;

        ProcessBuilder pb = new ProcessBuilder()
            .redirectError(Redirect.INHERIT)
            .directory(new File("src/examples"));
        
        List<String> cmd1 = Arrays.asList(
            //"./connect-four-naive",
			//"C:/Racket/Racket.exe",
			//"C:/SCHOOL FILES/CSCI 3508 (Intro to Software Engineering)/Team-9-Driver/Team-9-Driver/src/examples/connect-four-naive.rkt",
            "--player", "1",
            "--height", Integer.toString(height),
            "--width", Integer.toString(width)
        );
        
        List<String> cmd2 = Arrays.asList(
            //"julia",
            //"connect-four-naive.jl",
			//"C:/Racket/Racket.exe",
			//"C:/SCHOOL FILES/CSCI 3508 (Intro to Software Engineering)/Team-9-Driver/Team-9-Driver/src/examples/connect-four-naive.rkt",
            //"./connect-four-scoring",
            "--player", "2",
            "--height", Integer.toString(height),
            "--width", Integer.toString(width)
        );
        
        try {
            
            p1 = new PlayerProcess(pb.command(cmd1).start());
            p2 = new PlayerProcess(pb.command(cmd1).start());
            
            int winner;
            while (true) {
                p1.sendGrid(board); 
                board.addPlayerMove(1, p1.getMove());
                if (board.playerWon(1)) {
                    winner = 1;
                    break;
                }

                p2.sendGrid(board);				
                board.addPlayerMove(2, p2.getMove());
                if (board.playerWon(2)) {
                    winner = 2;
                    break;
                }
            }

            System.out.printf("The winner is %d\n", winner);
            
            p1.close();
            p2.close();
            
        } catch (IOException e) {
            System.out.println(e);
            return;
        } 
    }
}
