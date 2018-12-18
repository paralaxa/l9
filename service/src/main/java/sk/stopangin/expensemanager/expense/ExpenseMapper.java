package sk.stopangin.expensemanager.expense;

import org.mapstruct.Mapper;
import sk.stopangin.expensemanager.common.CommonEntityToDtoMapper;

@Mapper(componentModel = "spring")
public interface ExpenseMapper extends CommonEntityToDtoMapper<ExpenseDto, ExpenseCreateDto,ExpenseUpdateDto, Expense> {

}
