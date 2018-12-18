package sk.stopangin.expensemanager.category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
public interface CategoryDao extends JpaRepository<Category,Long> {
}
