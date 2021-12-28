package kr.or.shi.issue07;


public class Player{

    private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
    //2번
	public void upgradeLevel(PlayerLevel level) {
		
		this.level = level;
		level.showLevelMessage();
		
	}

	public void play(int count) {
		level.go(count);
	}


}