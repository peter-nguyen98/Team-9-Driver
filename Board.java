/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectFour;

/**
 *
 * @author ryanvacca
 */
public class Board 
{
    private int row;
    private int column;
    private char[][] connectBoard;
    private int connectNumber;

    Board(int irow, int icolumn, int iconnectNumber)
    {
        row = irow;
        column = icolumn;
        connectNumber = iconnectNumber;
        connectBoard = new char[row][column];
    }

    public void loadBoardEmpty()
    {
        for(int rowIterator = 0; rowIterator < row; rowIterator++)
        {
            for(int columnIterator = 0; columnIterator < column; columnIterator++)
            {
                connectBoard[rowIterator][columnIterator] = '-';
            }
        }
    }
    
    
   
    /****  Check all rows for that specific column   ****/
    /****  Input: Integer value of Column to check   ****/
    /****  Output: Returns row number to populate or -1 if entire column is full   ****/
    public int determineRow(int columnAdd)
    {
        for(int rowIterator = 0; rowIterator < row; rowIterator++)
        {
            if(connectBoard[rowIterator][columnAdd] == '-')
            {
                return rowIterator;
            }
        }
        return -1;
    }
    
    /****  Add Players move to Game Board
     * @param player
     * @param columnAdd ****/
    public void addMoveToBoard(int player, int columnAdd)
    {
        char playerSymbol;
        if(player == 1)
        {
            playerSymbol = 'X';
        }
        else
        {
            playerSymbol = 'O';
        }
        int addRow = determineRow(columnAdd - 1);
        if(addRow != -1)
        {
            connectBoard[addRow][columnAdd - 1] = playerSymbol;
        }
    }
                
    public void printBoard()
    {
        System.out.print("            Player Board");
        System.out.print('\n');
        System.out.print("-------------------------------------");
        System.out.print('\n');
        for(int rowIterator = row; rowIterator > 0; rowIterator--)
        {
            for(int columnIterator = 0; columnIterator < column ; columnIterator++)
            {
                System.out.print(connectBoard[(rowIterator - 1)][(columnIterator)]);
                System.out.print("    ");
            }
            System.out.println('\n');
        }
        System.out.print("-------------------------------------");
        System.out.print('\n');
        for(int columnIterator = 0; columnIterator < column; columnIterator++)
        {
            System.out.print(columnIterator + 1);
            System.out.print("    ");
        }
        System.out.print('\n');
        System.out.print('\n');
    }
    
    public boolean checkUpDown(char whichPlayer)
    {   
        int fromRow = (connectNumber - 1); //3
        int toRow = (row - 1); //6
        int fromColumn = 0; //0
        int toColumn = (column - 1); //7
        
        for(int i = fromRow; i <= toRow; i++)
        {
            for(int j = fromColumn; j <= toColumn; j++)
            {
                int counter = 0;
                for(int k = 0; k < connectNumber; k++)
                {
                    if(connectBoard[i-k][j] == whichPlayer)
                    {
                        counter++;
                    }
                }
                if(counter == connectNumber)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkLeftRight(char whichPlayer)
    {
        int fromRow = 0; //0
        int toRow = (row - 1); //6
        int fromColumn = 0; //0
        int toColumn = (column - connectNumber); //4
        
        for(int i = fromRow; i <= toRow; i++)
        {
            for(int j = fromColumn; j <= toColumn; j++)
            {
                int counter = 0;
                for(int k = 0; k <connectNumber; k++)
                {
                    if(connectBoard[i][j+k] == whichPlayer)
                    {
                        counter++;
                    }
                }
                if(counter == connectNumber)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkDiagnolLeft(char whichPlayer)
    {
        int fromRow = (connectNumber - 1); //3
        int toRow = (row - 1); //6
        int fromColumn = (connectNumber - 1); //3
        int toColumn = (column - 1); //7
        
        for(int i = fromRow; i <= toRow; i++)
        {
            for(int j = fromColumn; j <= toColumn; j++)
            {
                int counter = 0;
                for(int k = 0; k < connectNumber; k++)
                {
                    if(connectBoard[i - k][j - k] == whichPlayer)
                    {
                        counter++;
                    }
                }
                if(counter == connectNumber)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkDiagnolRight(char whichPlayer)
    {
        int fromRow = (connectNumber - 1); //3
        int toRow = (row - 1); //6
        int fromColumn = 0; //0
        int toColumn = (column - connectNumber); //4
        
        for(int i = fromRow; i <= toRow; i++)
        {
            for(int j = fromColumn; j <= toColumn; j++)
            {
                int counter = 0;
                for(int k = 0; k < connectNumber; k++)
                {
                    if(connectBoard[i - k][j + k] == whichPlayer)
                    {
                        counter++;
                    }
                }
                if(counter == connectNumber)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkAll(char whichPlayer)
    {
        if(checkUpDown(whichPlayer) || checkLeftRight(whichPlayer) || checkDiagnolLeft(whichPlayer) || checkDiagnolRight(whichPlayer))
        {
            return true;
        }
        
        return false;
    }
    
}//Class
