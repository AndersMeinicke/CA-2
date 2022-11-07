package Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserRoleId implements Serializable {
    private static final long serialVersionUID = -820308704570106792L;
    @Size(max = 20)
    @NotNull
    @Column(name = "role_name", nullable = false, length = 20)
    private String roleName;

    @Size(max = 25)
    @NotNull
    @Column(name = "user_name", nullable = false, length = 25)
    private String userName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleId entity = (UserRoleId) o;
        return Objects.equals(this.roleName, entity.roleName) &&
                Objects.equals(this.userName, entity.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName, userName);
    }

}