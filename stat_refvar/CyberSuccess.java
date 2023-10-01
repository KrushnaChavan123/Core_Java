//Assignment 2/9/23


class StudentInfo
{
 int studentId;
 String studentName;
 StudentInfo(int studentId,String studentName)
 {
  System.out.println(" Kindly wait for setting studentInfo ");
  this.studentId=studentId;
  this.studentName=studentName;
 }
 void studentInfo()
 {
  System.out.println(" Wait for fetching employee info ");
  System.out.println("StudentId is "+ studentId +" StudentName is"+ studentName);
  //System.out.println("StudentId is "+studentId+"StudentName is"+studentName);
 }
}
//controller class
class CyberSuccess
{
 public static void main(String[]args)
 {
  StudentInfo student1=new StudentInfo(11, " RJ ");
  student1.studentInfo();
  StudentInfo student2=new StudentInfo(21, " RK ");
  student2.studentInfo();
 }
}