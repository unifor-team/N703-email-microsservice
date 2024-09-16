package com.email.ms_email.controller;

import com.email.ms_email.EmailService.EmailService;
import com.email.ms_email.models.EmailModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emails")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping
    public ResponseEntity<List<EmailModel>> listAllEmails() {
        List<EmailModel> emails = emailService.listAllEmails();
        return new ResponseEntity<>(emails, HttpStatus.OK);
    
    }
}