/**
 * 
 */
package com.pasm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pasm.dao.UserDAO;
import com.pasm.model.User;

/**
 * @author Peter
 *
 */
@Service
public class UserServiceImpl implements UserService {
     
    private UserDAO userDAO;
 
    public void setPersonDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
 
    @Override
    @Transactional
    public void addPerson(User p) {
        this.userDAO.addPerson(p);
    }
 
    @Override
    @Transactional
    public void updatePerson(User p) {
        this.userDAO.updatePerson(p);
    }
 
    @Override
    @Transactional
    public List<User> listPersons() {
        return this.userDAO.listPersons();
    }
 
    @Override
    @Transactional
    public User getPersonById(int id) {
        return this.userDAO.getPersonById(id);
    }
 
    @Override
    @Transactional
    public void removePerson(int id) {
        this.userDAO.removePerson(id);
    }
}