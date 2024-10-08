package model_dao;

import model_entities.Department;
import model_entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert (Seller obj);
    void update (Seller obj);
    Department deleteById (Integer id);
    Seller findById (Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
