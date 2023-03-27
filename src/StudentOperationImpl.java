import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentOperationImpl implements StudentOperation {
  ArrayList<Student> students = new ArrayList<>();
  Student student = new Student();

  @Override
  public void add() {
    students.add(new Student("kiran", "udhan", 101, 9123538789L, 3000, "Jalna"));
    students.add(new Student("swati", "gujar", 102, 8912563788L, 2000, "Beed"));
    students.add(new Student("amar", "udhan", 104, 9123554789L, 3500, "Jalna"));
    students.add(new Student("jyoti", "gujar", 105, 8912563777L, 2500, "Beed"));
    students.add(new Student("vaishnavi", "Pakhare", 103, 9223412345L, 1500, "Nagar"));

    //Taking inputs from users
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a first name :: ");
//    String firstName = sc.nextLine();
//    System.out.println("Enter a last name :: ");
//    String LastName = sc.nextLine();
//    System.out.println("Enter a roll number :: ");
//    int rollNo = sc.nextInt();
//    System.out.println("Enter a Mobile number :: ");
//    long monileNo = sc.nextLong();
//    System.out.println("Enter a fees :: ");
//    int fees = sc.nextInt();
//    System.out.println("Enter a city :: ");
//    String city = sc.nextLine();
//    sc.nextLine();
//    students.add(new Student(firstName,LastName,rollNo,monileNo,fees,city));
  }

  @Override
  public void update() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a first name :: ");
    String firstName = sc.nextLine();
    for (Student student : students) {
      if (firstName.equals(student.getfName())) {
        System.out.println("Choose field you want to add:");
        System.out.println("1.First Name 2.Last Name 3.Phone Number 4.roll no 5. city 6. fees");
        int choice = sc.nextInt();
        switch (choice) {
          case 1:
            System.out.println("Re-Correct your firstname");
            student.setfName(sc.next());
            break;
          case 2:
            System.out.println("Re-correct your Lastname");
            student.setlName(sc.next());
            break;
          case 3:
            System.out.println("Re-Correct your Phone Number");
            student.setMobileNo(sc.nextLong());
            break;
          case 4:
            System.out.println("Re-Correct your roll-no");
            student.setRollNo(sc.nextInt());
            break;
          case 5:
            System.out.println("Re-Correct your City");
            student.setCity(sc.next());
            break;
          case 6:
            System.out.println("Re-Correct your fees");
            student.setFees(sc.nextInt());
            break;

          default:
            System.out.println("Enter valid number");
        }
      }
    }
  }

  @Override
  public void show() {
    for (Student s : students) {
      System.out.println(s.getfName() + " " + s.getlName() + " " + s.getRollNo() + " " + s.getCity() + " " + s.getFees() + " " + s.getMobileNo());
    }
  }

  @Override
  public void delete() {
    boolean flag = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a first name :: ");
    String firstName = sc.nextLine();
    for (int i = 0; i < students.size(); i++){
      Student student1 = students.get(i);
      if(firstName.equals(student1.getfName())){
        flag = true;
        students.remove(student1);
      }
    }
    if (flag == false){
      System.out.println("Entered contact not found");
    }
  }

  @Override
  public void filterByFees() {
   students.stream().filter(fees -> student.getFees() > 2000).map(n -> n.getfName()).forEach(System.out::println);
  }


  public void SortingByCityName(){
    students.sort((s1,s2) -> s1.getCity().compareToIgnoreCase(s2.getCity()));
    students.forEach(System.out::println);
  }

  public void nameofMinStudentFees() {
    Optional<String> nameOfMinFees = students.stream()
            .min((stud1, stud2) -> stud1.getFees() > stud2.getFees() ? 1 : -1)
            .map(student -> student.getfName());
    System.out.println(nameOfMinFees);
  }








}



