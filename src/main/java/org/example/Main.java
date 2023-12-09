package org.example;

import lombok.Data;
import org.example.controller.CategoryController;
import org.example.entity.Category;
import org.example.repository.CategoryRepository;
import org.example.service.CategoryService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //CategoryRepository categoryRepository = new CategoryRepository();
      /*  CategoryService categoryService = new CategoryService();
        Category category = new Category();
        category.setNamee("elektronik eşya");
        category.setSerial("bilgisayar");
        categoryService.saveCategory(category);*/

        CategoryController categoryController = new CategoryController();
        //categoryController.saveCategory("laptop12345","21342131245");
        categoryController.deleteCategory("laptop12345");
        //categoryController.deleteCategory("beyaz eşya");
        //categoryController.updateCategory("elektronik eşya","vcszvadfa");

        //System.out.println(categoryRepository.getAll());
        //System.out.println(categoryRepository.getById(1));
        //System.out.println(categoryRepository.getByName("beyaz eşya"));



    }
}