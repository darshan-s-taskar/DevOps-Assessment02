/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vit.devops.macse639.Assessment02;

/**
 *
 * @author darsh
 */
public class Assessment02 {

    public static void main(String[] args) {
        Project project = new Project("admin", "123");
        Report report = new Report("admin", "123");
        Employee employee = new Employee("admin", "123");

        project.addProject();
        report.generateReport();
        employee.addEmployee();
    }
}
