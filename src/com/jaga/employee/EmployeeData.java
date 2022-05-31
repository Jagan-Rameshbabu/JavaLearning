package com.jaga.employee;

import java.util.Arrays;
import java.util.List;

/** The type Employee data. */
public class EmployeeData {

  /**
   * Gets all employees.
   *
   * @return the all employees
   */
  public static List<Employee> getAllEmployees() {
    return List.of(
        new Employee(
            1, "John", "john@outlook.com", 35, "TECH", Arrays.asList(123456789, 234567890)),
        new Employee(1, "Harry", "harry@gmail.com", 27, "MIS", Arrays.asList(523456783, 934567891)),
        new Employee(1, "Alex", "alex@yahoo.com", 31, "TECH", List.of(834567892)),
        new Employee(
            1, "Kelly", "kelly@outlook.com", 34, "HR", Arrays.asList(563456784, 734567893)),
        new Employee(1, "Doug", "doug@live.com", 45, "HR", Arrays.asList(223456785, 634567894)),
        new Employee(1, "Mary", "mary@gmail.com", 58, "FIN", Arrays.asList(903456786, 534567895)),
        new Employee(1, "Peter", "peter@outlook.com", 51, "TECH", List.of(893456787)),
        new Employee(1, "Joe", "joe@yahoo.com", 21, "TECH", Arrays.asList(453456788, 334567897)));
  }
}
