package sk.stopangin.expensemanager.category;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
@Service
@Transactional
@Validated
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao;
    private CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryDao categoryDao, CategoryMapper categoryMapper) {
        this.categoryDao = categoryDao;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public CategoryDto create(CategoryCreateDto categoryCreateDto) {
        final Category category = categoryMapper.entityFromCreateDto(categoryCreateDto);
        return categoryMapper.dtoFromEntity(categoryDao.save(category));
    }

    @Override
    public CategoryDto update(CategoryUpdateDto categoryUpdateDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    @Transactional(readOnly = true)
    public CategoryDto findById(Long id) {
        return categoryMapper.dtoFromEntity(categoryDao.getOne(id));
    }

    @Override
    @Transactional(readOnly = true)
    public Set<CategoryDto> findAll() {
        return null;
    }
}
