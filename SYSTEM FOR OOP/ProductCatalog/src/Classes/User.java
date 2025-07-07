
package Classes;

public class User {   
    private String username;
    private String password;
    private String name;
    private String id;
    private Gender gender;
    
    public enum Gender {
        MALE, FEMALE
    }
    
    public User(String username, String password, String name, String id, Gender gender) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.id = id;
        this.gender = gender;
    }
    
    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public String getId() { return id; }
    public Gender getGender() { return gender; }
    
    // Setters
    public void setPassword(String password) { this.password = password; }
    public void setName(String name) { this.name = name; }
    
    public void displayProfile() {
        System.out.println("User Profile:");
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("ID: " + id);
        System.out.println("Gender: " + gender);
    }
    
    @Override
    public String toString() {
        return "User[name=" + name + ", username=" + username + ", id=" + id + "]";
    }
}

