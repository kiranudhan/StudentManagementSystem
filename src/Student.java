public class Student {
    private String fName;
    private String lName;
    private int rollNo;
    private long mobileNo;
    private int fees;
    private String city;

    public Student() {
    }

    public Student(String fName, String lName, int rollNo, long mobileNo, int fees, String city) {
        this.fName = fName;
        this.lName = lName;
        this.rollNo = rollNo;
        this.mobileNo = mobileNo;
        this.fees = fees;
        this.city = city;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", rollNo=" + rollNo +
                ", mobileNo=" + mobileNo +
                ", fees=" + fees +
                ", city='" + city + '\'' +
                '}';
    }
}
