package Entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Size(max = 25)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_name", nullable = false, length = 25)
    private String id;

    @Size(max = 255)
    @Column(name = "user_pass")
    private String userPass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

}