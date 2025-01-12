// Student Management System

// Problem:

// Create a Student class with the following attributes:

// Name

// Roll Number

// Marks in 3 subjects

// Include methods to:

// Calculate the total, percentage and average marks.

// Display student details and their grade (A, B, C, etc.) based on the average.
public class Student{
    // instance variable
    String name;
    int rollNumber;
    int marksPhysics, marksMaths, marksBiology;
  
    // constructor
    // student class ka constructor jo ki 5 
    // parameter recieve karega taki instance variable ko initialize kiya ja sake
    Student(String name, int rollNum, int marksPhy, int marksMath, int marksBio){
        this.marksBiology=marksBio;
        this.marksMaths= marksMath;
        this.marksPhysics = marksPhy;
        this.name = name;
        this.rollNumber = rollNum;
        System.out.println("an object of Student class is created and all the instance variables are initialised ");
    }

    // total
    int calculateTotal (){
        int totalMarks = this.marksBiology + this.marksPhysics + this.marksMaths;
        // System.out.println("total marks : "+ totalMarks);
        return totalMarks;
    }
    // percentage
    double calculatePercentage(){
        // 100/3

        // 0.49 *100 ==> 49
        // 0.49 ==> 0.0 *100===> 0.0
        double percentage = (double)calculateTotal()/300 * 100;
        System.out.println("percentage : "+ percentage);

        return percentage;
    }
    // average
    double calculateAverage(){
        double average = this.calculateTotal()/3;
        // System.out.println(" average " + average);
        return average;
    }
    // display info, it should als display grade calculating from the percenrtage
    void displayInformation(){
        System.out.println("\nThe name of the student " +this.name+ " \nThe marks obtained by him/her in Biology " +this.marksBiology+ "\nThe marks obtained by him/her in Maths " +this.marksMaths+ " \nThe marks obtained by him/her in Physics " +this.marksPhysics);
        this.calculateTotal();
        this.calculateAverage();
        double percentage = this.calculatePercentage();
        if(percentage>=90 && percentage<=100){
            System.out.println("Grade A");

        }else if(percentage>=80 && percentage < 90){
            System.out.println("Grade B");

        }else if(percentage>=60 && percentage < 80){
            System.out.println("Grade C");

        }else{
            System.out.println("FAIL");
        }


    }

    public static void main(String[] args) {
        Student ishan = new Student("ishan bhattacharya", 11, 79, 80, 90);
        // int x = ishan.calculateTotal();
        // System.out.println("total marks: "+ ishan.calculateTotal());
        // System.out.println("average: "+ishan.calculateAverage());

        ishan.displayInformation();

    }
    
}