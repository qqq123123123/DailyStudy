package kr.or.shi.issue07;

public class PlayerLevelTest {
    public static void main(String[] args) {
        //1번
		Player player = new Player();
		player.play(1);
		//2번
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
    }
}
