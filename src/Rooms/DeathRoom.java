package Rooms;

import Game.Runner;
import People.Person;

public class DeathRoom extends Room
{
    public DeathRoom(int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You hear a faint click. You look up just in time to see a cinder block crush you, killing you instantly.");
        Runner.gameOff();
    }
}
