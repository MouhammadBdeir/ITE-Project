package com.example.demo.kunde.Controller;

import com.example.demo.kunde.service.CustomerService;

import com.example.demo.kunde.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private FeedbackService feedbackService;


}