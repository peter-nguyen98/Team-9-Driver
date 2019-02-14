/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author ryanvacca
 */
public class driver 
{
    driver()
    {
        board game1 = new board(7,8,4);
        game1.loadBoardEmpty();
        
        //Row 1
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8); 
        
        //Row 2
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8);
        
        //Row 3
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8); 
        
        //Row 4
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8);
        
        //Row 5
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8); 
        
        //Row 6
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8);
        
        //Row 7
        game1.addMoveToBoard(2, 1);
        game1.addMoveToBoard(2, 2);
        game1.addMoveToBoard(2, 3);
        game1.addMoveToBoard(2, 4);
        game1.addMoveToBoard(2, 5);
        game1.addMoveToBoard(2, 6);
        game1.addMoveToBoard(2, 7); 
        game1.addMoveToBoard(2, 8);
        
        
        
        boolean gameOver = game1.checkAll('X');
        game1.printBoard();
        
        if(gameOver)
        {
            System.out.print("Winner");
        }
        else
        {
            System.out.print("No Win");
        }
    }
    
}
