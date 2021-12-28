package kr.or.shi.stringbuilder;

public class StringBuliderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("java");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append("kotlin");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		
	}

}
