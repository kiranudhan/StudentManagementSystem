import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperationImpl implements StudentOperation{
  ArrayList<Student> students = new ArrayList<>();

  @Override
  public void add() {
    students.add(new Student("kiran","udhan",101,9123538789L,3000,"Jalna"));
    students.add(new Student("swati","gujar",102,8912563788L,2000,"Beed"));
    students.add(new Student("amar","udhan",104,9123554789L,3500,"Jalna"));
    students.add(new Student("jyoti","gujar",105,8912563777L,2500,"Beed"));
    students.add(new Student("vaishnavi","Pakhare",103,9223412345L,1500,"Nagar"));

    //Taking inputs from users
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a first name :: ");
    String firstName = sc.nextLine();
    System.out.println("Enter a last name :: ");
    String LastName = sc.nextLine();
    System.out.println("Enter a roll number :: ");
    int rollNo = sc.nextInt();
    System.out.println("Enter a Mobile number :: ");
    long monileNo = sc.nextLong();
    System.out.println("Enter a fees :: ");
    int fees = sc.nextInt();
    System.out.println("Enter a city :: ");
    String city = sc.nextLine();
    sc.nextLine();
    students.add(new Student(firstName,LastName,rollNo,monileNo,fees,city));
  }
}
