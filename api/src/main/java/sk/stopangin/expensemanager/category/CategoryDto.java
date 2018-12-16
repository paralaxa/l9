package sk.stopangin.expensemanager.category;


import sk.stopangin.expensemanager.user.UserDto;

import java.io.Serializable;

public class CategoryDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private UserDto creator;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDto getCreator() {
        return creator;
    }

    public void setCreator(UserDto creator) {
        this.creator = creator;
    }
}
