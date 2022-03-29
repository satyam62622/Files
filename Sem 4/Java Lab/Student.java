//Write a java program to take an input as command line argument (name,course,roll,semester)


public class Student{
public static void main(String[] Args){

String name,course,roll_no,semester;

name=Args[0];
course=Args[1];
roll_no=Args[2];
semester=Args[3];

System.out.println("Name: "+name+"\nCourse: "+course+"\nroll: "+roll_no+"\nsemester:"+semester);
}
}
