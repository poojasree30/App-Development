package EComm.demo.controller;

import model.Model;
import Services.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/learn")
public class Controller{
    @Autowired
        Service s1;
    @GetMapping("/getAll")
    public List<Model> getDetail()
    {
        return s1.g
    }

}