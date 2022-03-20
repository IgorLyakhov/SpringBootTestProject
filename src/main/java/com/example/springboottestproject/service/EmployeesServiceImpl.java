package com.example.springboottestproject.service;

import com.example.springboottestproject.dao.EmployeesDAO;
import com.example.springboottestproject.dao.EmployeesDAOImpl;
import com.example.springboottestproject.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService{

    @Autowired
    private EmployeesDAO employeesDAO;

    @Override
    @Transactional
    public List<Employees> getAllEmployees() {
        return employeesDAO.getAllEmployees();
    }
}
