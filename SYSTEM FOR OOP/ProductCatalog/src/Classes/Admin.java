/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author daryl James
 */
import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private String adminId;
    private List<String> permissions;
    private SecurityLevel securityLevel;
    
    public enum SecurityLevel {
        REGULAR, SUPERVISOR, SYSTEM
    }
    
    public Admin(String username, String password, String name, 
                String id, Gender gender, String adminId, 
                SecurityLevel securityLevel) {
        super(username, password, name, id, gender);
        this.adminId = adminId;
        this.securityLevel = securityLevel;
        this.permissions = new ArrayList<>();
      
    }
    // Admin-specific getters
    public String getAdminId() { return adminId; }
    public SecurityLevel getSecurityLevel() { return securityLevel; }
    public List<String> getPermissions() { return new ArrayList<>(permissions); }
    
    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Admin ID: " + adminId);
        System.out.println("Security Level: " + securityLevel);
        System.out.println("Permissions: " + permissions);
    }
    
    @Override
    public String toString() {
        return "Admin[adminId=" + adminId + ", " + super.toString() + "]";
    }
}
