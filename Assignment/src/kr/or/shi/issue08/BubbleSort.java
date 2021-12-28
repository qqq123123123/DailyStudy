package kr.or.shi.issue08;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] i) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] i) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
        Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}
    
}