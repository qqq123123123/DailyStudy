package kr.or.shi.issue08;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] i) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] i) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
        Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}
    
}
