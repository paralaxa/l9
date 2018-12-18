package sk.stopangin.expensemanager.category;

import org.springframework.stereotype.Component;
import sk.stopangin.expensemanager.user.User;
import sk.stopangin.expensemanager.user.UserDto;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-18T08:36:39+0100",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category entityFromDto(CategoryCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( dto.getName() );
        category.setDescription( dto.getDescription() );

        return category;
    }

    @Override
    public CategoryDto dtoFromEntity(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( entity.getId() );
        categoryDto.setName( entity.getName() );
        categoryDto.setDescription( entity.getDescription() );
        categoryDto.setCreator( userToUserDto( entity.getCreator() ) );

        return categoryDto;
    }

    @Override
    public Category entityFromCreateDto(CategoryCreateDto c) {
        if ( c == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( c.getName() );
        category.setDescription( c.getDescription() );

        return category;
    }

    @Override
    public void enrichEntityWithUpdateDto(Category e, CategoryUpdateDto c) {
        if ( c == null ) {
            return;
        }

        e.setId( c.getId() );
        e.setName( c.getName() );
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
}
