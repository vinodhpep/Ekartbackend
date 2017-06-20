package com.niit.shoppingcartbackend.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcartbackend.dao.UserDAO;
import com.niit.shoppingcartbackend.model.User;
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public void save(User user) {
		
		sessionFactory.getCurrentSession().save(user);
		
	}

	public void update(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser=(List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return  listUser;
	}

	public User get(String userId) {
		String hql="from userinfo where userId ='" + userId+"'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser=(List<User>) (query).list();
		if(listUser!= null && !listUser.isEmpty()){
			
		return  listUser.get(0);
		
	}
		return null;
	}

	public User getMail(String mailId) {
		String hql="from userinfo where mailId ='" + mailId+"'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		
		List<User> listUser=(List<User>) (query).list();
		if(listUser!= null && !listUser.isEmpty()){
			
		return  listUser.get(0);
		
	}
		return null;
	}

	public void delete(String userId) {
		User userToDelete=new User();
		userToDelete.setUserId(userId);
		sessionFactory.getCurrentSession().delete(userToDelete);
		
		// TODO Auto-generated method stub
		
	}


}
