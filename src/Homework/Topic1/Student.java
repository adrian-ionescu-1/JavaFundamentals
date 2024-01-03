package Homework.Topic1;

public class Student {
    private String name;
    private int age;
    private Course course;
    private String studentID;
    private double averageGrade;

    public Student(String name, int age, Course course, String studentID, double averageGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentID = studentID;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Average Grade: " + averageGrade);
    }
}
