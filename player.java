/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

public class player 
{
    private String name;
    private int playerId;
    private int currentChoice;
    private boolean playerWin;
    
    player()
    {
        name = "";
        playerId = -1;
        currentChoice = -1;
        playerWin = false;
    }
    player(String iName, int iPlayerId, int iCurrentChoice, boolean iPlayerWin)
    {
        name = iName;
        playerId = iPlayerId;
        currentChoice = iCurrentChoice;
        playerWin = iPlayerWin;
    }
    public void setName(String iName)
    {
        name = iName;
    }
    public String getName()
    {
        return name;
    }
    public void setPlayerId(int iPlayerId)
    {
        playerId = iPlayerId;
    }
    public int getPlayerId()
    {
        return playerId;
    }
    public void setCurrentChoice(int iCurrentChoice)
    {
        currentChoice = iCurrentChoice;
    }
    public int getCurrentChoice()
    {
        return currentChoice;
    }
    public void setPlayerWin(boolean iPlayerWin)
    {
        playerWin = iPlayerWin;
    }
    public boolean getPlayerWin()
    {
        return playerWin;
    }
}
