package org.example.controller;

import org.example.entity.Category;
import org.example.service.CategoryService;
import org.example.utility.Singleton;

public class CategoryController {
    CategoryService categoryService = Singleton.getCategoryService();

public void saveCategory(String categoryName,String serial){
    Category category = new Category();
    category.setNamee(categoryName);
    category.setSerial(serial);
    categoryService.saveCategory(category);

}
public void deleteCategory(String categoryName){
   Category category = new Category();
    category.setNamee(categoryName);
    categoryService.deleteCategory(category);
}
/*public void updateCategory(String categoryName,String serial){
    Category category = new Category();
    category.setName(categoryName);
    category.setSerial(serial);
    categoryService.updateCategory(category);
}*/

}
