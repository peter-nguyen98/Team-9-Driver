
package ConnectFour;

import com.google.gson.Gson;

public class Main 
{

    // Note: I'm not using the driver directly now because
    // the command line arguments are in main.
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
    public static void main(String[] args)
    { 
        //ProcessBuilder pb = new ProcessBuilder(
        //    "connect-four-naive",
        //    "--player 1",
        //    "--width 10",
        //    "--height 10");
        //
        //pb.directory(new File("../examples"));
        //Process p = pb.start();
        //p.getInputStream();
        
        Board b = new Board(7,8,4);
        b.loadBoardEmpty();
        b.addMoveToBoard(2, 1);

        Gson gson = new Gson();
        String json = gson.toJson(b);
        System.out.println(json);

        //{"row":7,"column":8,"connectBoard":[["O","-","-","-","-","-","-","-"],["-","-","-","-","-","-","-","-"],["-","-","-","-","-","-","-","-"],["-","-","-","-","-","-","-","-"],["-","-","-","-","-","-","-","-"],["-","-","-","-","-","-","-","-"],["-","-","-","-","-","-","-","-"]],"connectNumber":4}
        
        // Desired output:
        //{"grid": [[0, 0, 0], [0, 0, 0], [0, 0, 0]]}
        //{"move":2}

        // IMO This file is the driver, it is redundant to call the driver
        //Driver driver = new Driver();
    }
}
