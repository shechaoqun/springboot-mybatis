package com.shechaoqun.modules.dao;

import com.shechaoqun.modules.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by chaoqunshe on 8/30/17.
 */
@Mapper
public interface CustomerDao {

    Customer getCustomerById(Long id);
    List<Customer> getCustomersPages(int endTag,int count);
}
