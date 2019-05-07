package com.wibro.book.dao;

import com.wipro.book.Book;

public class bookdaoimpl {

}
@Repository("bookDao")
public class bookdaoImpl implements bookdao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public user doLogin(user) {
		Session session = sessionFactory.getCurrentSession();
		user user2 = (user)session.get(user.class, user.getEmail());
		if (user2 == null || !user2.getPassword().equals(user.getPassword())) {
			
			return null;
		}
		return user2;
	}
}
