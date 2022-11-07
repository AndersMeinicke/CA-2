package dto;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Entities.Role} entity
 */
public class RoleDto implements Serializable {
    @Size(max = 20)
    private final String roleName;

    public RoleDto(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleDto entity = (RoleDto) o;
        return Objects.equals(this.roleName, entity.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "roleName = " + roleName + ")";
    }
}