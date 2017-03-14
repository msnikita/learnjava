/*

Topic: Inheritance

Task: 
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  4 parameters:
A string, firstName.
A string, lastName.
An integer, id.
An integer array (or vector) of test scores, scores.
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:

Grading Scale:

---letter---		---Average(a)---
       O		   90<=a<=100
       E		   80<=a<90
       A 		   70<=a<80
       P		   55<=a<70
       D		   40<=a<55
       T		       a<40

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin: 
The first line contains fisrtName, lastName, and id, respectively. The second line contains the number of test scores. The third line of space-separated integers describes scores.

Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

Sample Input

Heraldo Memelli 8135627
2
100 80

Sample Output

Name: Memelli, Heraldo
ID: 8135627
Grade: O

Explanation

This student had 2 scores to average: 100  and 80. The student's average grade is (100+80)/2=90. An average grade of  corresponds to the letter grade , so our calculate() method should return the character'O'.
*/


import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    } 
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        char grade;
        int avg = 0;
        int total = 0;
        for (int i = 0; i < testScores.length; i++) {
            total = total + testScores[i];
        }
        // calculate the average
        avg = total/testScores.length;
        
        if (avg >= 90 && avg <= 100) {
            grade = 'O';
        } else if (80 <= avg && avg < 90) {
            grade = 'E';
        } else if (70 <= avg && avg < 80) {
            grade = 'A';
        } else if (55 <= avg && avg < 70) {
            grade = 'P';
        } else if (40 <= avg && avg < 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        return grade;       
    }
}

class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
