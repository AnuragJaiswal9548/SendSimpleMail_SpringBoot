package com.sendmailDemo.mail.Controller;

import com.sendmailDemo.mail.Model.MailStructure;
import com.sendmailDemo.mail.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class Controller {

    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
     mailService.sendMail(mail,mailStructure);
        return "Mail sent successfully";
    }
}
