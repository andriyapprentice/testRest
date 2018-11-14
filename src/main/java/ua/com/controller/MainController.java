package ua.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.dao.CustomerDao;
import ua.com.dao.impl.CustomerDAOimpl;
import ua.com.entity.Customers;
import ua.com.service.CustomerService;
import ua.com.service.impl.CustomerServiceImpl;

import java.sql.*;
import java.util.List;


@Controller
public class MainController {
//    private static Connection con;
//    private static Statement stmt;
//    private static ResultSet rs;

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/do")
    public String index(@RequestParam String someVar) {

//        Customers customers = customerService.findId();
//        System.out.println(customers.getCustomerName());

        List<Customers> customersList = customerDao.findAll();
                customersList.forEach(System.out::println);
//
        System.out.println("good");
        return "index";
    }

}