public class AttendanceTester {
   public static void main(String[] args) {
 
	AttendanceRecord jordan = new AttendanceRecord("Jordan", 4);
    AttendanceRecord riley = new AttendanceRecord("Riley", 7);


 	jordan.markPresent();
	jordan.printAttendance();
	riley.printAttendance();
    }   

}


class AttendanceRecord {
   private String name;
   private int daysPresent;
 
   public AttendanceRecord(String n, int d) {
      name = n;
      daysPresent = d;
   }
 
   public void markPresent() {
      daysPresent++;
   }
 
   public void printAttendance() {
      System.out.println(name + " — Days Present: " + daysPresent);
   }
}
