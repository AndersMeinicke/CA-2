package Entities;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private UserRoleId id;

    @MapsId("roleName")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_name", nullable = false)
    private Role roleName;

    public UserRoleId getId() {
        return id;
    }

    public void setId(UserRoleId id) {
        this.id = id;
    }

    public Role getRoleName() {
        return roleName;
    }

    public void setRoleName(Role roleName) {
        this.roleName = roleName;
    }

}