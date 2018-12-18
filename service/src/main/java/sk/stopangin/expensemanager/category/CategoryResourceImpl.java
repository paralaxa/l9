package sk.stopangin.expensemanager.category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
@RestController
@RequestMapping("/v1")
public class CategoryResourceImpl implements CategoryResource {
    private CategoryService categoryService;

    public CategoryResourceImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    @PostMapping("category")
    public CategoryDto create(@RequestBody CategoryCreateDto categoryCreateDto) {
        return categoryService.create(categoryCreateDto);
    }

    @Override
    public CategoryDto update(CategoryUpdateDto categoryUpdateDto, Long id) {
        return null;
    }

    @Override
    public Set<CategoryDto> getAll() {
        return null;
    }

    @Override
    @GetMapping("category/{id}")
    public CategoryDto getById(@PathVariable("id") Long id) {
        return categoryService.findById(id);
    }

//    @ExceptionHandler(ConstraintViolationException.class)
    protected ResponseEntity<Object> hanldeConstraintViolation(
            ConstraintViolationException ex) {
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
