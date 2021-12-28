package kr.or.shi.abstract04;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new Desktop();
		desktop.display();

		Computer notebook = new MyNoteBook();
		notebook.typing();
	}

}
