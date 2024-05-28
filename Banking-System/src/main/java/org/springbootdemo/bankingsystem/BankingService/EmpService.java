package org.springbootdemo.bankingsystem.BankingService;

import org.springbootdemo.bankingsystem.BankingEntity.Employee;
import org.springbootdemo.bankingsystem.BankingRepo.EmpRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpService {


    @Autowired
    private EmpRepo repo;
    public void addEmp(Employee e){

        repo.save(e);
    }

    public List<Employee> getAllEmp(){
        return repo.findAll();
    }
}
