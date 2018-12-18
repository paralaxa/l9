package sk.stopangin.expensemanager.expense;

import java.util.List;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
public interface ExpenseService {
    ExpenseDto create(ExpenseCreateDto expenseCreateDto);

    ExpenseDto update(ExpenseUpdateDto expenseUpdateDto);

    void delete(Long id);

    ExpenseDto findById(Long id);

    List<ExpenseDto> findByCategoryId(Long categoryId);

    List<ExpenseDto> findAll();

}
