package sk.stopangin.expensemanager.expense;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.stopangin.expensemanager.category.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by martin.cuchran on 12/18/2018.
 */

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService {
    private ExpenseMapper expenseMapper;
    private ExpenseDao expenseDao;

    @PersistenceContext
    private EntityManager entityManager;

    public ExpenseServiceImpl(ExpenseMapper expenseMapper, ExpenseDao expenseDao) {
        this.expenseMapper = expenseMapper;
        this.expenseDao = expenseDao;
    }

    @Override
    public ExpenseDto create(ExpenseCreateDto expenseCreateDto) {
        final Category category = entityManager.find(Category.class, expenseCreateDto.getCategoryId());
        final Expense expense = expenseMapper.entityFromDto(expenseCreateDto);
        expense.setCategory(category);
        return expenseMapper.dtoFromEntity(expenseDao.save(expense));
    }

    @Override
    public ExpenseDto update(ExpenseUpdateDto expenseUpdateDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    @Transactional(readOnly = true)
    public ExpenseDto findById(Long id) {
        return expenseMapper.dtoFromEntity(expenseDao.getOne(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ExpenseDto> findByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ExpenseDto> findAll() {
        return expenseDao.findAll().stream().map(expenseMapper::dtoFromEntity).collect(Collectors.toList());
    }
}
