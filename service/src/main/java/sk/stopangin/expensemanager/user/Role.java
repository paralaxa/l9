package sk.stopangin.expensemanager.user;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    private String authority;

    public String getAuthority() {
        return authority;
    }


}
