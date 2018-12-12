package com.lxisoft.quizapp.repository;

import java.util.List;

public interface Repository<T>{

    public boolean create(T obj);
    public List<T> retrieve(String ...condition);
    public boolean update(T obj);
    public boolean delete(T obj);


}