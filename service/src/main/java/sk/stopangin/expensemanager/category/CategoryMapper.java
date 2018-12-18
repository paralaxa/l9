package sk.stopangin.expensemanager.category;

import org.mapstruct.Mapper;
import sk.stopangin.expensemanager.common.CommonEntityToDtoMapper;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper extends CommonEntityToDtoMapper<CategoryDto,CategoryCreateDto,CategoryUpdateDto,Category>{}