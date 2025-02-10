package com.mybatis.customer.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.customer.model.vo.Customer;

public class CustomerDAO {
	
	
	//Service에서 넘어옴!!로그인!!
	public Customer selectOneByLogin(SqlSession session, Customer customer) {
		// TODO Auto-generated method stub
		Customer result = session.selectOne("CustomerMapper.selectOneByLogin",customer);
		return result;
	}
	
}
