package sk.stopangin.expensemanager.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class UserUpdateDto implements Serializable {
    @JsonIgnore
    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "UserCreateDto{" +
                ", username='" + username + '\'' +
                '}';
    }
}
