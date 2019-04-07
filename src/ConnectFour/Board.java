
package ConnectFour;

/**
 *
 * @author ryanvacca
 */
public class Board {

    private int row;
    private int column;
    private char[][] grid;
    private int connectNumber;

    Board(int row, int column, int connectNumber) {
        this.row = row;
        this.column = column;
        this.connectNumber = connectNumber;
        grid = new char[row][column];
        loadBoardEmpty();
    }

    private void loadBoardEmpty() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                grid[i][j] = '-';
            }
        }
    }
    
    
    /****  Check all rows for that specific column   ****/
    /****  Input: Integer value of Column to check   ****/
    /****  Output: Returns row number to populate or -1 if entire column is full   ****/
    public int determineRow(int column) {
 
        for (int i = 0; i < row; i++) {
            if (grid[i][column] == '-') {
                return i;
            }
        }
        return -1;
    }
    
    /****  Add Players move to Game Board
     * @param player
     * @param column ****/
    public void addMoveToBoard(int player, int column) {
 
        char symbol = (player == 1) ? 'X' : 'O';
        int add = determineRow(column - 1);
        if (add != -1) {
            grid[add][column - 1] = symbol;
        }
    }
    
    public void printBoard() {
 
        System.out.print("            Player Board");
        System.out.print('\n');
        System.out.print("-------------------------------------");
        System.out.print('\n');
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < column ; j++) {
                System.out.print(grid[(i - 1)][(j)]);
                System.out.print("    ");
            }
            System.out.println('\n');
        }
        System.out.print("-------------------------------------");
        System.out.print('\n');
        for (int j = 0; j < column; j++) {
 
            System.out.print(j + 1);
            System.out.print("    ");
        }
        System.out.print('\n');
        System.out.print('\n');
    }
    
    public boolean checkVerticalWin(char whichPlayer) {
    
        int fromRow = (connectNumber - 1); // 3
        int toRow = (row - 1);             // 6
        int fromColumn = 0;                // 0
        int toColumn = (column - 1);       // 7
        
        for (int i = fromRow; i <= toRow; i++) {
 
            for (int j = fromColumn; j <= toColumn; j++) {
 
                int counter = 0;
                for (int k = 0; k < connectNumber; k++) {
                    if (grid[i-k][j] == whichPlayer) {
                        counter++;
                    }
                }
                if (counter == connectNumber) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkHorizontalWin(char whichPlayer) {
 
        int fromRow = 0;                         // 0
        int toRow = (row - 1);                   // 6
        int fromColumn = 0;                      // 0
        int toColumn = (column - connectNumber); // 4
        
        for (int i = fromRow; i <= toRow; i++) {
 
            for (int j = fromColumn; j <= toColumn; j++) {
 
                int counter = 0;
                for (int k = 0; k < connectNumber; k++) {
                    if (grid[i][j + k] == whichPlayer) {
                        counter++;
                    }
                }
                if (counter == connectNumber) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkDiagnolLeftWin(char whichPlayer) {
 
        int fromRow = (connectNumber - 1);    // 3
        int toRow = (row - 1);                // 6
        int fromColumn = (connectNumber - 1); // 3
        int toColumn = (column - 1);          // 7
        
        for (int i = fromRow; i <= toRow; i++) {
 
            for (int j = fromColumn; j <= toColumn; j++) {
 
                int counter = 0;
                for (int k = 0; k < connectNumber; k++) {
                    if (grid[i - k][j - k] == whichPlayer) {
                        counter++;
                    }
                }
                if (counter == connectNumber) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkDiagnolRightWin(char whichPlayer) {
 
        int fromRow = (connectNumber - 1);       // 3
        int toRow = (row - 1);                   // 6
        int fromColumn = 0;                      // 0
        int toColumn = (column - connectNumber); // 4
        
        for (int i = fromRow; i <= toRow; i++) {
 
            for (int j = fromColumn; j <= toColumn; j++) {
 
                int counter = 0;
                for (int k = 0; k < connectNumber; k++) {
                    if (grid[i - k][j + k] == whichPlayer) {
                        counter++;
                    }
                }
                if (counter == connectNumber) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean playerWon(char player) {
        return (
            checkVerticalWin(player)    ||
            checkHorizontalWin(player)  ||
            checkDiagnolLeftWin(player) ||
            checkDiagnolRightWin(player)
        );
    } 
    
}
