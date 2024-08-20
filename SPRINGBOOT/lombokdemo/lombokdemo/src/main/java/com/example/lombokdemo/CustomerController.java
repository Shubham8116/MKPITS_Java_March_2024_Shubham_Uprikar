package com.example.lombokdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
private Customer customer;
@Autowired
    public CustomerController(Customer customer)
{
    this.customer=customer;
}
@GetMapping("/")
    public String sayHello()
{
    return "Hello";
}

@GetMapping("/show")
    public int showid()
{

}
//{
//    //log.info("test log: "+ stud);
//    Customer customer=customerService.getMessage(stud);
//   // ((Object) log).debug("test debug log : "+customer.toString());
//    return customer;
//}
}
