public class student {
    private String name;
    private String email;
    private String regNo;
    private int age;
    private String stays;

    public student(String name , String email, String regNo, int age, String stays){
        this.name = name;
        this.email = email;
        this.regNo = regNo;
        this.age = age;
        this.stays = stays;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getRegNo(){
        return this.regNo;
    }
    public int getAge(){
        return this.age;
    }
    public String getStays(){
        return this.stays;
    }

    public static void main(String[] args) {
        student student = new student("John", "john@example.com", "123456789", 25, "Nairobi");
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(student.getRegNo());
        System.out.println(student.getAge());
        System.out.println(student.getStays());
    }

}
