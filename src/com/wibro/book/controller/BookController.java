package com.wibro.book.controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value="/")
	public String doRedirect() {
		return "index";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request, @ModelAttribute Hospital hospital, Map<String, String> map) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			System.out.println("Not null");
			return "book";
		}
		System.out.println("Not null");
		Hospital bookRef = bloodRequestService.doLogin(book);
		if(bookRef == null) {
			map.put("error", " password is incorrect");
			return "error";
		}
		System.out.println(bookRef);
		map.put("password", bookRef.getpassword());
		map.put("name", bookRef.getName());
		return "book";
	}
	
	
}

