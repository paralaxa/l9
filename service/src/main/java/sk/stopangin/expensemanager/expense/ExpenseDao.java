package sk.stopangin.expensemanager.expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
public interface ExpenseDao extends JpaRepository<Expense, Long> {
    List<Expense> findByCategory_Id(Long categoryId);

    @Query("select e from Expense e join fetch e.category")
    List<Expense> findAll();
}
