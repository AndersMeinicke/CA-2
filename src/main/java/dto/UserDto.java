package dto;

import Entities.User;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link Entities.User} entity
 */
public class UserDto implements Serializable {
    private Integer id;
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

    public UserDto(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public UserDto(User user) {
        if(user.getId() != null)
            this.id = user.getId();
        this.userName = getUserName();
        this.userPass = getUserPass();
    }

    public static List<UserDto> getDtos(List<User> users){
        final List<UserDto> userDtos = new ArrayList();
        users.forEach(user->userDtos.add(new UserDto(user)));
        return userDtos;
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