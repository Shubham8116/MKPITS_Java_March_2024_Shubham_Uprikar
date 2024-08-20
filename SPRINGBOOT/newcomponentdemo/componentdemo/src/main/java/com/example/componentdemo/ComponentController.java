package com.example.componentdemo;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class ComponentController {
    Account account;
    Account account1;
    @Autowired
    public ComponentController(@Qualifier("loanAccount") Account account,@Qualifier("loanAccount") Account account1)
    {

        this.account=account;
        this.account1=account1;
    }
@GetMapping("/")
    public String welcome()
{
    return "Hello !";
}

@GetMapping("/details")
    public String getDetails()
{
    return account.getDetails();
}

@GetMapping("/check")
    public String check()

{
return account==account1?"Equal":"Not Equal";
}


}
