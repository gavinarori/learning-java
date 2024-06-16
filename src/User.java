public class User {
    private String name;
    private String email;
    private String password;
    private String nickName;
    private String bio;
    private int age;

    public User(String name, String email, String password, String nickName, String bio, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.bio = bio;
        this.age = age;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getUsername() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }
    public void setNickname(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        User user = new User("John Doe", "john@example.com", "password123", "Johnny", "I love programming!", 25);
        user.name = "tommy";
        System.out.println("Login successful: " + user.login("john@example.com", "password123")); 
        System.out.println("Login successful: " + user.login("john@example.com", "wrongpassword"));

        
        System.out.println("Username: " + user.getUsername()); 
        System.out.println("Bio: " + user.getBio());
        
        user.setNickname("JohnD");
        System.out.println("Nickname set to: " + user.nickName);

        System.out.println("Age: " + user.getAge()); 
    }
}
