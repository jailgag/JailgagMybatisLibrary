package com.mybatis.customer.model.Service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.common.SqlSessionTemplate;
import com.mybatis.customer.model.dao.CustomerDAO;
import com.mybatis.customer.model.vo.Customer;

public class CustomerService {
	
	//1
	private CustomerDAO cDao;
	//2/
	private SqlSession session;
	
	public CustomerService() {
		
		cDao = new CustomerDAO();
		
		session = SqlSessionTemplate.getSqlSession();
	}
	//로그인서블렛에서 넘어옴!!
	public Customer selectOneByLogin(Customer customer) {
		// TODO Auto-generated method stub
		Customer result = cDao.selectOneByLogin(session,customer);
		return result;
	}

}
