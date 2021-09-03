package kr.or.shi.issue08;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("정렬방식을 선택하세요");
		System.out.println("B: BubbleSort");
		System.out.println("H: HearSort");
		System.out.println("Q: QuickSort");
		Sort sort = null;

		String Choice = scan.nextLine();
		if(Choice.equals("B"))
		{
			sort = new BubbleSort();
		}
		else if(Choice.equals("H"))
		{
			sort = new HeapSort();
		}
		else if(Choice.equals("Q"))
		{
			sort = new QuickSort();
		}
		else
		{
			System.out.println("잘못 선택하셨습니다.");
			
			scan.close();
			return;
		}
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		scan.close();
	}

}
