package kr.or.shi.string;

/*
 * 	replace():	문자열을 대치시킴
 * 
 */

public class ReplaceTest {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(newStr);
		
		System.out.println(oldStr.hashCode());
		System.out.println(newStr.hashCode());
		
		System.out.println();
		
		String java = new String("java");
		String kotlin = new String("kotlin");
		java.concat(kotlin);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
	}

}
