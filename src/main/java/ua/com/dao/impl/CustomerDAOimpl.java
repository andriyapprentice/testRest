package ua.com.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dao.CustomerDao;
import ua.com.entity.Customers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CustomerDAOimpl implements CustomerDao {


    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Customers> findAll() {

    List<Customers> customersList=  manager.createQuery("from Customers c", Customers.class).getResultList();
        return customersList;

    }
}
