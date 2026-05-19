
public class Student {
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

    public String calculateGrade(){
    if(marks >=80) {
        return "A";
    } else if (marks >= 70) {
       return "B";
    } else if (marks >=60) {
        return "C";
    } else if (marks >=50) {
         return "D";
    }
    else {
        return "F";
    }

    }

    boolean isPassed() {
        if (marks >= 50) {
            return true;
        } else {
            return true;
        }
    }
    public static void schoolMotto(){
            System.out.println("Education For Everyone");
        }
    public String compareMarks( Student otherStudent){
        if (marks > otherStudent.marks) {
            return name;
        }
        else{
            return otherStudent.name;
        }

    }

    public static void main (String[] args){
    Student.schoolMotto();
    Student john = new Student ("John", 18 ,76);
    Student keza = new Student("keza" , 20 , 89);

    int bonusmarks = 5;
    john.marks = john.marks + bonusmarks;
        System.out.println("John's new marks: " + john.marks);
        john.displayStudentInfo();

        System.out.println("Grade: " + john.calculateGrade());
        System.out.println("Passed: " + john.isPassed());

        keza.displayStudentInfo();
        System.out.println("Grade: " + keza.calculateGrade());
        System.out.println("Passed: " + keza.isPassed());

        System.out.println("Higher marks: " + john.compareMarks(keza));

    }
}
