 class Student {

    private int rollNum;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    
    public void setStudentDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

 
    public void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }


    public void displayStudDetails() {
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Student Name: " + studName);
        System.out.println("Total Marks: " + totalMarks);
    }
}


class student1 {
    public static void main(String[] args) {
 
        Student student = new Student();
        student.setStudentDetails(101, "rahul", 85, 90, 95);
     
        student.calculateTotal();
        student.displayStudDetails();
    }
}