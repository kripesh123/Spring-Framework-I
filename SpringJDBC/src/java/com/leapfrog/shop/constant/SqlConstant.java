/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shop.constant;

/**
 *
 * @author Admin
 */
public class SqlConstant {
    public static final String ENQUIRY_INSERT="INSERT INTO " + TableConstant.ENQUIRY_TABLE + 
                        "(first_name,last_name,email,contact_no,is_read) VALUES(?,?,?,?,?)";
    
    public static final String ENQUIRY_UPDATE="UPDATE " + TableConstant.ENQUIRY_TABLE + 
                        " SET first_name=?,last_name=?,email=?,contact_no=?,is_read=? WHERE id=?";
   
    public static final String ENQUIRY_DELETE="DELETE FROM " + TableConstant.ENQUIRY_TABLE + " WHERE id=?";
    
    public static final String ENQUIRY_GET_ALL="SELECT * FROM "+ TableConstant.ENQUIRY_TABLE;
    
    public static final String ENQUIRY_GET_BY_ID="SELECT * FROM "+ TableConstant.ENQUIRY_TABLE + " WHERE id=?";
}
