package org.example.repository;

import org.example.entity.Category;
import org.example.utility.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements BaseRepository<Category> {

    DBConnection dbConnection = new DBConnection();

    @Override
    public void saveCategory(Category category) {
        try {
            dbConnection.openSession();
            dbConnection.session.save(category);
            dbConnection.closeSession();
        } catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
        }
    }

/*
    @Override
    public void updateCategory(Category category) {
        try {
            dbConnection.openSession();
            dbConnection.session.update(category);
            dbConnection.closeSession();
        } catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
        }
    }
*/

    @Override
    public void deleteCategory(Category category) {
        try {
            dbConnection.openSession();
            dbConnection.session.delete(category);
            dbConnection.closeSession();
        } catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
        }
    }

    @Override
    public Category getById(int id) {
        try {
            dbConnection.openSession();
            Category category = dbConnection.session.find(Category.class, id);
            dbConnection.closeSession();
            return category;
        } catch (NullPointerException nullPointerException) {
            System.err.println("Bu id'ye sahip kategori mevcut değildir.");
            dbConnection.rollback();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
            return null;
        }
    }


    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try {
            dbConnection.openSession();
            categories =
                    dbConnection.session.createNativeQuery("select * from category", Category.class).getResultList();
            dbConnection.closeSession();
            return categories;
        } catch (Exception e) {
            dbConnection.rollback();
            return categories;
        }
    }

    @Override
    public Category getByName(String categoryName) {

        String sql = "select * from category where namee = '"+ categoryName +"'";
        Category category = null;
        try {
            dbConnection.openSession();
            category = dbConnection.session.createNativeQuery(sql, Category.class).getSingleResult();
            if (category == null) {
                dbConnection.closeSession();
                System.out.println(category.getId() + " " + category.getNamee());
                return category;
            } else {
                dbConnection.closeSession();
                return category;
            }
        } catch (NullPointerException nullPointerException) {
            System.err.println("bu kategori adına ait kategori mevcut değildir.");
            return category;
        } catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
            return category;
        }
    }
}
