package com.jaga.employee;

/** The type Employee main. */
public class EmployeeMain {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    EmployeeData.getAllEmployees().forEach(System.out::println);
  }
}
