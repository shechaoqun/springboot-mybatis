package com.shechaoqun.modules.service;

import com.shechaoqun.modules.dao.CustomerDao;
import com.shechaoqun.modules.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chaoqunshe on 8/30/17.
 */
@Service
@Transactional(readOnly = true)
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Transactional(readOnly = true)
    public Customer getCustomerById(Long id){
        return customerDao.getCustomerById(id);
    }

    @Transactional(readOnly = true)
    public List<Customer> getCustomersPages(int endTag, int count){
        return  customerDao.getCustomersPages(endTag,count);
    }
}
