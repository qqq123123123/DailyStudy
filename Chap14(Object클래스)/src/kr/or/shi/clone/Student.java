package kr.or.shi.clone;

public class Student implements Cloneable {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName)
    {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }
    
    public void setStudentName(String name)
    {
    	this.studentName = name;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Student)
        {
            Student stu = (Student)obj;
            if(this.studentNum == stu.studentNum)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return studentNum;
    }

    @Override
    public String toString() {
        return studentNum + ", " + studentName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

}
