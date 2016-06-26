/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shop.service.impl;

import com.leapfrog.shop.dao.EnquiryDAO;
import com.leapfrog.shop.entity.Enquiry;
import com.leapfrog.shop.service.EnquiryService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class EnquiryServiceImpl implements EnquiryService {
    @Autowired
    private EnquiryDAO enquiryDAO;
    
    @Override
    public int insert(Enquiry enquiry) throws SQLException, ClassNotFoundException {
        return enquiryDAO.insert(enquiry);
    }

    @Override
    public int update(Enquiry enquiry) throws SQLException, ClassNotFoundException {
        return enquiryDAO.update(enquiry);
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        return enquiryDAO.delete(id);
    }

    @Override
    public Enquiry getById(int id) throws SQLException, ClassNotFoundException {
        return enquiryDAO.getById(id);
    }

    @Override
    public List<Enquiry> getAll() throws SQLException, ClassNotFoundException {
        return enquiryDAO.getAll();
    }
    
}
