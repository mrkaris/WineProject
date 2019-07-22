/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.mycompany.thewineproject.daos.UserProfileDao;
import com.mycompany.thewineproject.models.UserProfile;
 
 
@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
     
    @Autowired
    UserProfileDao dao;
     
    @Override
    public UserProfile findById(int id) {
        return dao.findById(id);
    }
 
    @Override
    public UserProfile findByType(String type){
        return dao.findByType(type);
    }
 
    @Override
    public List<UserProfile> findAll() {
        return dao.findAll();
    }
}