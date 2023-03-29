
public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Welcome to student management system");
        StudentOperationImpl operation = new StudentOperationImpl();
        operation.add();
        operation.show();
//        operation.update();
//        operation.show();
//        operation.delete();
//        operation.show();
        operation.nameofMinStudentFees();
        operation.filterByFees();
        operation.SortingByCityName();
        operation.minFeesOfStudent();
        operation.maxFeesOfStudent();
    }
}
