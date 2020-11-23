package th.ac.kmitl.films.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.films.Model.Customer;
import th.ac.kmitl.films.service.CustomerService;

import java.text.AttributedString;

@Controller
@RequestMapping("/customer")
public class CustomerController<CustomerService, customerService> {
    private  CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomerPage(Model model) {


        model.addAttribute("allCustomers", customerService.getClass());
        return "Customer";
    }
    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer, Model Customer) {
        customerService.createCustomer(Customer);
        AttributedString model;
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "redirect:customer";
    }
}
