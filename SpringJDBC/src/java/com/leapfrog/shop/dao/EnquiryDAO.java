/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shop.dao;

import com.leapfrog.shop.entity.Enquiry;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface EnquiryDAO {
    
    int insert(Enquiry enquiry)throws SQLException,ClassNotFoundException;
    int update(Enquiry enquiry)throws SQLException,ClassNotFoundException;
    int delete(int id)throws SQLException,ClassNotFoundException;
    Enquiry getById(int id)throws SQLException,ClassNotFoundException;
    List<Enquiry> getAll()throws SQLException,ClassNotFoundException;
    
}
