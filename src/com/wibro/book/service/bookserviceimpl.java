package com.wibro.book.service;

import com.wipro.book.Book;
@Service("bookService")
public class bookImpl implements bookService{
	@Autowired
	private bookdao bookdao;
	@Transactional
	@Override
	
	public Book doLogin(Book book) {
		return Book.doLogin(book);
	}
	
}