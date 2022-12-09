package ru.ngs.summerjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ngs.summerjob.entity.Employee;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        String name = employee.getName();
        employee.setName("Mr. " + name);

        String surname = employee.getSurName();
        employee.setSurName(surname + " !!!");

        int salary = employee.getSalary();
        employee.setSalary(salary * 2);
        return "show-emp-details-view";
    }
}
