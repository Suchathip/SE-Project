//package th.ac.kmitl.films.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import th.ac.kmitl.films.Model.Customer;
//
//@Controller
//@RequestMapping("/login")
//public class LoginController<CustomerService> {
//    private CustomerService customerService;
//
//    public LoginController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//
//    @GetMapping
//    public String getLoginPage(){
//        return "login";
//    }
//    @PostMapping
//    public String login(@ModelAttribute Customer customer, Model model){
//        Customer matchingCustomer = CustomerService.checkPin(customer);
//        if (matchingCustomer != null){
//            model.addAttribute("greeting","Welcome ," + matchingCustomer.getName());
//        } else {
//            model.addAttribute("greeting","Can't find Customer");
//        }
//        return "home";
//    }
//    }
//}
