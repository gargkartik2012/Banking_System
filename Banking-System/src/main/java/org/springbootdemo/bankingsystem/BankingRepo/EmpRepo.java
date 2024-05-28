package org.springbootdemo.bankingsystem.BankingRepo;

import org.springbootdemo.bankingsystem.BankingEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
