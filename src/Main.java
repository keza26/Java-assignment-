
public class Student{
    String name;
    int age;
    int marks;


    public Student(String name, int age, int marks) {

        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayStudentInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Marks: " +marks);
    }

    public String calculateGrade)(){
    if(marks >=80) {
        System.out.println("A");
    } else if (marks >= 70) {
        System.out.println("B");
    } else if (marks >=60) {
        System.out.println("C");
    } else if (marks >=50) {
        System.out.println("D");
    }
    else {
        System.out.println("F");
    }

    }

    boolean isPassed(){
    if (marks >=50){
        System.out.println("TRUE");
    }
    else {
        System.out.println("FALSE");
    }
    public static void schoolMotto(){
            System.out.println("Education For Everyone");
        }
    public String compareMarks( Object Object otherStudent;
        otherStudent;
        otherStudent )
        if (marks > otherStudent) {
            System.out.println("Name: " +name);
        }
        else {
            System.out.println();
        }

    }

    public static void main (String[] args){
    Student.schoolMotto();
    Student john = new Student ("John", 18 ,76);
    Student keza = new Student("keza" , 20 , 89);

    }
}
