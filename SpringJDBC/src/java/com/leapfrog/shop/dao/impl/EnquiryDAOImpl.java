/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shop.dao.impl;

import com.leapfrog.shop.constant.SqlConstant;
import com.leapfrog.shop.dao.EnquiryDAO;
import com.leapfrog.shop.entity.Enquiry;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class EnquiryDAOImpl implements EnquiryDAO{
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Enquiry e) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.update(SqlConstant.ENQUIRY_INSERT,new Object[]{e.getFirstName(),e.getLastName(),e.getEmail(),e.getContactNo(),e.isRead()});
    }

    @Override
    public int update(Enquiry e) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.update(SqlConstant.ENQUIRY_UPDATE,new Object[]{e.getFirstName(),e.getLastName(),e.getEmail(),e.getContactNo(),e.isRead(),e.getId()});
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.update(SqlConstant.ENQUIRY_DELETE,new Object[]{id});
    }

    @Override
    public Enquiry getById(int id) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.queryForObject(SqlConstant.ENQUIRY_GET_BY_ID, new Object[]{id},new RowMapper<Enquiry>() {

            @Override
            public Enquiry mapRow(ResultSet rs, int i) throws SQLException {
                Enquiry enquiry=new Enquiry();
                enquiry.setId(rs.getInt("id"));
                enquiry.setFirstName(rs.getString("first_name"));
                enquiry.setLastName(rs.getString("last_name"));
                enquiry.setEmail(rs.getString("email"));
                enquiry.setContactNo(rs.getString("contact_no"));
                enquiry.setEnquiryDate(rs.getDate("enquiry_date"));
                enquiry.setRead(rs.getBoolean("is_read"));
                return enquiry;
            }
        });
    }

    @Override
    public List<Enquiry> getAll() throws SQLException, ClassNotFoundException {
        
        return jdbcTemplate.query(SqlConstant.ENQUIRY_GET_ALL, new RowMapper<Enquiry>() {

            @Override
            public Enquiry mapRow(ResultSet rs, int i) throws SQLException {
                Enquiry enquiry=new Enquiry();
                enquiry.setId(rs.getInt("id"));
                enquiry.setFirstName(rs.getString("first_name"));
                enquiry.setLastName(rs.getString("last_name"));
                enquiry.setEmail(rs.getString("email"));
                enquiry.setContactNo(rs.getString("contact_no"));
                enquiry.setEnquiryDate(rs.getDate("enquiry_date"));
                enquiry.setRead(rs.getBoolean("is_read"));
                return enquiry;
            }
        });
    }
    
}
