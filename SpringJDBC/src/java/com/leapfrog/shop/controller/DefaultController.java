/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shop.controller;

import com.leapfrog.shop.dao.EnquiryDAO;
import com.leapfrog.shop.entity.Enquiry;
import com.leapfrog.shop.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(value="/")
public class DefaultController {
    
    @Autowired
     EnquiryService enquiryService;
    
    @RequestMapping(method=RequestMethod.GET)
    public  String index(Model model){
        try{
        model.addAttribute("enquiries", enquiryService.getAll());
        
        model.addAttribute("enquiry", enquiryService.getById(2));
        }catch(Exception ie){
            System.out.println(ie.getMessage());
        }
        return "index";
    }
    
}
