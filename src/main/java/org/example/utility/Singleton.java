package org.example.utility;

import org.example.repository.CategoryRepository;
import org.example.service.CategoryService;

public class Singleton {
  private static CategoryService categoryService;
  private static CategoryRepository categoryRepository;

    public static CategoryRepository getCategoryRepository(){
        if(categoryRepository==null){
            return new CategoryRepository();
        }
        else {
            return categoryRepository;
        }
    }
    public static CategoryService getCategoryService(){
        if(categoryService==null){
            return new CategoryService();
        }
        else {
            return categoryService;
        }
    }
}
