package com.exam1.statics;
/** Bill mentioned using statics for memory efficiency in project 2 tests*/
public class Student {
    static int count;
    int studentId;
    String firstName;
    String lastName;
    
    
    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }
    
    public int totalStudents() {
        return count;
    }
    //using helper methods from Util class
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        //notice how i did not have to create a Util object with the new keyword.
        //this is because the methods are static and stored into memory at class load time (not instantiation)
        System.out.println(Util.add(num1, num2));
        System.out.println(Util.difference(num1, num2));
        
        //using a counter to track all Student objects created
        Student marco = new Student(12345, "Marco", "Polo");
        System.out.println("Student count called from Marco: " + marco.totalStudents());
        Student nephtali = new Student(54321, "Nephtali", "Guevarra");
        System.out.println("Student count Called from Nephtali: " + marco.totalStudents());
        //notice here even though the first call of total Students from Marco was 1 the second call was 2
        // this is because the field count is shared across all objects created from the Student class
        System.out.println("Student count called from Marco: " + marco.totalStudents());
        
    }
}
