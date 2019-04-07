
package ConnectFour;

public class Player  {

    private static int nextId = 1;

    final private int ID;
    private String name;
    private int currentChoice;
    private boolean playerWin;
    
    Player() {
        name = "";
        ID = nextId++;
        currentChoice = -1;
        playerWin = false;
    }
    
    Player(String iName, int iCurrentChoice, boolean iPlayerWin) {
 
        name = iName;
        ID = nextId++;
        currentChoice = iCurrentChoice;
        playerWin = iPlayerWin;
    }
    
    public void setName(String iName) {
        name = iName;
    }
    
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setCurrentChoice(int iCurrentChoice) {
 
        currentChoice = iCurrentChoice;
    }

    public int getCurrentChoice() {
 
        return currentChoice;
    }

    public void setPlayerWin(boolean iPlayerWin) {
 
        playerWin = iPlayerWin;
    }

    public boolean getPlayerWin() {
 
        return playerWin;
    }
}
