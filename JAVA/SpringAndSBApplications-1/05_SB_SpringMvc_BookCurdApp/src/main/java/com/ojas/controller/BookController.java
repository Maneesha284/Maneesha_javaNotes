package com.ojas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ojas.model.Book;
import com.ojas.service.BookServiceImple;

@Controller
public class BookController {
	@Autowired
	private BookServiceImple serviceDao;

//	@RequestMapping(value = "/loadForm",method = RequestMethod.GET)
	@GetMapping("/loadForm")
	public String loadForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "book";
	}
	@PostMapping("/insert")
	public String handleSubmitForm(@ModelAttribute Book book, Model model) {
		int count = serviceDao.insert(book);
		String msg = "";
		if (count != 0)
			msg = "Book Data Added Successfully";
		else
			msg = "Book Data Not Added Successfully";
		model.addAttribute("msg", msg);
		return "book";
	}
	@GetMapping("/viewAllRecords")
	public String viewAllRecords(Model model) {

		List<Book> viewRecords = serviceDao.viewAllBooks();

		model.addAttribute("bookrecordss", viewRecords);

		return "view";
	}
}
