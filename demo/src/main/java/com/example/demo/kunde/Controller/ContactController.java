package com.example.demo.kunde.Controller;

import com.example.demo.kunde.service.CustomerService;
import com.example.demo.kunde.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller

    @RequestMapping("/")
    public class ContactController {
    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/index")
    public String showForm(Model model) {
        System.out.println("showForm sucess ");
        return "index";
    }
    @GetMapping("/projects")
    public String showProjects(Model model) {
        System.out.println("showProjects sucess ");
        return "Projekte";
    }
    @GetMapping("/QuS")
    public String showQuS(Model model) {
        System.out.println("showQuS sucess");
        return "QuS";
    }
    @GetMapping("/Auditierung")
    public String showAuditierung(Model model) {
        System.out.println("showAuditierung sucess");
        return "Auditierung";
    }
    @GetMapping("/Beratung")
    public String showBeratung(Model model) {
        System.out.println("showBeratung sucess");
        return "Beratung";
    }
    @GetMapping("/HuST")
    public String showHuST(Model model) {
        System.out.println("showHuST sucess");
        return "HuST";
    }
    @GetMapping("/Engineering")
    public String showEngineering(Model model) {
        System.out.println("showEngineering sucess");
        return "Engineering";
    }
    @GetMapping("/Programierung")
    public String showProgramierung(Model model) {
        System.out.println("showProgramierung sucess");
        return "Programierung";
    }
    @GetMapping("/Akustik")
    public String showAkustik(Model model) {
        System.out.println("showAkustik sucess");
        return "Akustik";
    }
    @GetMapping("/SHuK")
    public String showSHuK(Model model) {
        System.out.println("showSHuK sucess");
        return "SHuK";
    }
    @GetMapping("/Kontakt")
    public String showKontakt(Model model) {
        System.out.println("showKontakt sucess");
        return "Kontakt";
    }
    @GetMapping("/impressum")
    public String showImpressum(Model model) {
        System.out.println("showImpressum sucess");
        return "impressum";
    }
    @GetMapping("/referenzen")
    public String showReferenzen(Model model) {
        System.out.println("showReferenzen sucess");
        return "referenzen";
    }
    @GetMapping("/test")
    public String showTest(Model model) {
        System.out.println("showTest sucess");
        return "test";
    }




}
