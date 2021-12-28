package kr.or.shi.issue07;

public abstract class PlayerLevel{
    public PlayerLevel()
    {
    	
    }
    public abstract void jump();
    public abstract void run();
    public abstract void showLevelMessage();
    public abstract void turn();
    final public void go(int count)
    {
        run();
        for(int i = 0; i < count; i++)
        {
            jump();;
        }
        turn();
    }
}


