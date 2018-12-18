package sk.stopangin.expensemanager.category;

import javax.validation.Valid;
import java.util.Set;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
public interface CategoryService {

    CategoryDto create(@Valid CategoryCreateDto categoryCreateDto);

    CategoryDto update(CategoryUpdateDto categoryUpdateDto);

    void delete (Long id);

    CategoryDto findById(Long id);

    Set<CategoryDto> findAll();
}
