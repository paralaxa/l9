package sk.stopangin.expensemanager.expense;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class ExpenseCreateDto implements Serializable {
    @JsonIgnore
    private Long creatorId;
    private String description;
    private Long categoryId;

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
