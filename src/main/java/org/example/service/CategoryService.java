package org.example.service;

import org.example.entity.Category;
import org.example.repository.BaseRepository;
import org.example.repository.CategoryRepository;
import org.example.utility.Singleton;

import java.util.List;

public class CategoryService {
BaseRepository<Category> baseRepository;
CategoryRepository categoryRepository = Singleton.getCategoryRepository();


public CategoryService(){
    this.baseRepository = Singleton.getCategoryRepository();
}
public void saveCategory(Category category) {
        if (baseRepository.getByName(category.getNamee()).getId() == 0) {
                Category category1 = new Category();
                category1.setNamee(category.getNamee());
                baseRepository.saveCategory(category1);
                System.out.println("Kategori eklendi.");
        }
    else{
                        System.out.println("Var olan kategori atılamaz.");


        }
}
public void deleteCategory(Category category){
    if(baseRepository.getByName(category.getNamee()).getId() !=0){
        Category category1 = new Category();
        category1.setNamee(category.getNamee());
        category1.setSerial(category.getSerial());
        baseRepository.deleteCategory(category1);
        System.out.println("Kategori silindi");
    }
    else {
      System.out.println("var olmayan kategori silinemez.");

    }
}
/*public void updateCategory(Category category){
if(baseRepository.getByName(category.getName()).getId()!=0){
    baseRepository.updateCategory(category);
}
else {
    System.out.println("var olmayan kategori güncellenemez.");
}
}*/
}
