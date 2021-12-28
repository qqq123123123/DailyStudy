package kr.or.shi.abstract04;

public class Desktop extends Computer{

	public Desktop()
	{
		
	}
	
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	
	public void turnOff()
	{
		System.out.println("Desktop turnOff");
	}

}
