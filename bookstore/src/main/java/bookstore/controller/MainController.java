package bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import bookstore.bookDao.BookDao;
import bookstore.model.Book;

@Controller
public class MainController {

	@Autowired
	private BookDao bookDao;

	@RequestMapping(path = "/")
	public String home(Model m) {
		return "index";
	}
	
	@RequestMapping(path = "/books")
	public String show_book(Model m) {
		List<Book> books = bookDao.getAllBooks();
		m.addAttribute("books", books);
		return "books";
	}

//	add-book
	@RequestMapping(path = "/add-book")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Book");
		return "add_book_form";
	}

//	handle addbook form
	@RequestMapping(path = "/handle-book", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Book book, HttpServletRequest request) {
		System.out.println(book);
		this.bookDao.createBook(book);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

//	delete handler
	@RequestMapping(path = "/delete/{bookId}", method = RequestMethod.GET)
	public RedirectView deleteProduct(@PathVariable("bookId") int bookId, HttpServletRequest request) {
		this.bookDao.deleteBook(bookId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

//	update handler
	@RequestMapping(path = "update/{bookId}")
	public String updateForm(@PathVariable("bookId") int pid, Model m) {

		Book book = this.bookDao.getBook(pid);
		m.addAttribute("book", book);

		return "update_form";
	}

}
