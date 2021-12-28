package kr.or.shi.equals;

public class StudentTest {
    public static void main(String[] args) {
    	int[] arr1 = {1,2,3};
    	int[] arr2 = {1,2,3};
    	
    	
        Student student1 = new Student(10, "류현진", arr1);
        Student student2 = new Student(10, "류현진", arr2);

        System.out.println(student1.equals(student2));
        
        Student student3 = new Student(10, "류현진", arr1);
        Student student4 = new Student(10, "이승엽", arr2);

        System.out.println(student3.equals(student4));

        
    }
}
