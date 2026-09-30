public class StudentTester {
   public static void main(String[] args) {
      Student one = new Student("Jordan", 9);
      Student two = new Student("Taylor", 10);
      Student three = new Student("Morgan", 11);
 
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}

class Student {
   private String name;
   private int grade;


   public Student(String name, int grade)
   {
       this.name = name;
	 this.grade = grade;
   }
 
   public void printInfo() {
      System.out.println(name + " — Grade " + grade);
   }
}
