package kr.or.shi.issue08;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] i) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] i) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
        Sort.super.description();
		System.out.println("HeapSort 입니다.");
	}
    
}
