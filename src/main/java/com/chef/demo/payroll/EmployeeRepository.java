package com.chef.demo.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /*
    This interface extends JpaRepository which will allow it to:
    Create new Employees
    Update existing ones
    Delete Employees
    Find Employees (one, all, or search by simple or complex properties)
    */
}
