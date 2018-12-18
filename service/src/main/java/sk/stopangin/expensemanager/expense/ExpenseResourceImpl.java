package sk.stopangin.expensemanager.expense;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
@RestController
@RequestMapping("/v1")
public class ExpenseResourceImpl implements ExpenseResource {

    private ExpenseService expenseService;

    public ExpenseResourceImpl(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @Override
    @GetMapping("expense")
    public List<ExpenseDto> getAll() {
        return expenseService.findAll();
    }

    @Override
    @PostMapping("expense")
    public ExpenseDto create(@RequestBody ExpenseCreateDto expenseCreateDto) {
        return expenseService.create(expenseCreateDto);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ExpenseDto update(ExpenseUpdateDto expenseUpdateDto, Long id) {
        return null;
    }

    @Override
    public List<ExpenseDto> getByCategoryId(Long categoryId) {
        return null;
    }
}
