package sk.stopangin.expensemanager.category;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class CategoryCreateDto implements Serializable {
    private String name;
    private String description;
    @JsonIgnore
    private Long creatorId;

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


}
