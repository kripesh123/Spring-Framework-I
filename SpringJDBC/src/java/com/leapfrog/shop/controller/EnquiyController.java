/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shop.controller;

import com.leapfrog.shop.dao.EnquiryDAO;
import com.leapfrog.shop.entity.Enquiry;
import com.leapfrog.shop.service.EnquiryService;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(value="/enquiry")
public class EnquiyController {
    
    @Autowired
     EnquiryService enquiryService;
    
    @RequestMapping(method=RequestMethod.GET)
    public  String index(){
        
        return "enquiry/index";
    }
    
    @RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
    public @ResponseBody String edit(@PathVariable("id")int id){
        
        return "Edit " + id;
    }    
    
    @RequestMapping(method=RequestMethod.POST)
    public String save(HttpServletRequest req){
        Enquiry e=new Enquiry();
        e.setFirstName(req.getParameter("first_name"));
        e.setLastName(req.getParameter("last_name"));
        e.setEmail(req.getParameter("email"));
        e.setContactNo(req.getParameter("contact_no"));
        try{
            if(req.getParameter("id").equals(""))
        
            {
                enquiryService.insert(e);
            }
            else{
                int id=Integer.parseInt(req.getParameter("id"));
                e.setId(id);
                enquiryService.update(e);
            }
        }catch(SQLException  | ClassNotFoundException ce){
            System.out.println(ce.getMessage());
        }
        return "redirect:enquiry?success";
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id){
        try{
        enquiryService.delete(id);
        return "redirect:enquiry?success";
        }catch(SQLException | ClassNotFoundException ce){
            System.out.println(ce.getMessage());
        }
        return "redirect:/";
    }
    
}
