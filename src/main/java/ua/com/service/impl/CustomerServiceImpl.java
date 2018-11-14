package ua.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dao.CustomerDao;
import ua.com.dao.impl.CustomerDAOimpl;
import ua.com.entity.Customers;
import ua.com.service.CustomerService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {



//    @Autowired
//    private CustomerDAOimpl customerDAOimpl;
//
//
//    @Override
//    public List<Customers> findAll() {
//        return customerDAOimpl.findAll();
//    }
}

