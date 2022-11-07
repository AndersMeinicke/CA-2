package dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Entities.User} entity
 */
public class UserDto implements Serializable {
    private final Integer id;
    @Size(max = 25)
    @NotNull
    private final String userName;
    @Size(max = 255)
    private final String userPass;

    public UserDto(Integer id, String userName, String userPass) {
        this.id = id;
        this.userName = userName;
        this.userPass = userPass;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.userName, entity.userName) &&
                Objects.equals(this.userPass, entity.userPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userPass);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "userName = " + userName + ", " +
                "userPass = " + userPass + ")";
    }
}