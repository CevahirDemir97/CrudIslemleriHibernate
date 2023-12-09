package org.example.repository;

import java.util.List;

public interface BaseRepository<T> {

public void saveCategory(T t);

//void updateCategory(T t);

public void deleteCategory(T t);

public T getById(int id);

public List<T> getAll();

public T getByName(String categoryName);

}
