package ua.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.com.entity.Customers;

import java.util.List;

public interface CustomerDao {
//    @Query("from Customers c where id=:103")

  List<Customers> findAll();

}
