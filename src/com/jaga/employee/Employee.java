package com.jaga.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/** The type Employee. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  private Integer employeeId;
  private String employeeName;
  private String employeeEmail;
  private Integer employeeAge;
  private String employeeDepartment;
  private List<Integer> employeePhone;
}
