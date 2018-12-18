package sk.stopangin.expensemanager.expense;

import org.springframework.stereotype.Component;
import sk.stopangin.expensemanager.category.Category;
import sk.stopangin.expensemanager.category.CategoryDto;
import sk.stopangin.expensemanager.user.User;
import sk.stopangin.expensemanager.user.UserDto;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-18T08:36:39+0100",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
@Component
public class ExpenseMapperImpl implements ExpenseMapper {

    @Override
    public Expense entityFromDto(ExpenseCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        Expense expense = new Expense();

        expense.setDescription( dto.getDescription() );

        return expense;
    }

    @Override
    public ExpenseDto dtoFromEntity(Expense entity) {
        if ( entity == null ) {
            return null;
        }

        ExpenseDto expenseDto = new ExpenseDto();

        expenseDto.setId( entity.getId() );
        expenseDto.setCreator( userToUserDto( entity.getCreator() ) );
        expenseDto.setDescription( entity.getDescription() );
        expenseDto.setCategory( categoryToCategoryDto( entity.getCategory() ) );

        return expenseDto;
    }

    @Override
    public Expense entityFromCreateDto(ExpenseCreateDto c) {
        if ( c == null ) {
            return null;
        }

        Expense expense = new Expense();

        expense.setDescription( c.getDescription() );

        return expense;
    }

    @Override
    public void enrichEntityWithUpdateDto(Expense e, ExpenseUpdateDto c) {
        if ( c == null ) {
            return;
        }

        e.setId( c.getId() );
        e.setDescription( c.getDescription() );
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );

        return userDto;
    }

    protected CategoryDto categoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( category.getId() );
        categoryDto.setName( category.getName() );
        categoryDto.setDescription( category.getDescription() );
        categoryDto.setCreator( userToUserDto( category.getCreator() ) );

        return categoryDto;
    }
}
