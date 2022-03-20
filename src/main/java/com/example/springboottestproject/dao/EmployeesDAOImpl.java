package com.example.springboottestproject.dao;

import com.example.springboottestproject.entity.Employees;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employees> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);
        Query<Employees> query = session.createQuery("from Employees", Employees.class);
        List<Employees> allEmployees = query.getResultList();
        return allEmployees;
    }
}
