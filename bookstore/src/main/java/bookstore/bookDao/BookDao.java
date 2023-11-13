package bookstore.bookDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import bookstore.model.Book;

@Component
public class BookDao  {

	@Autowired
	private HibernateTemplate hibernateTemplate;

//	create book
	@Transactional
	public void createBook(Book book) {
		this.hibernateTemplate.saveOrUpdate(book);
	}

//	get single book
	public Book getBook(int bid) {
		Book book = this.hibernateTemplate.get(Book.class, bid);
		return book;
	}

//	get all books
	public List<Book> getAllBooks() {
		List<Book> books = this.hibernateTemplate.loadAll(Book.class);
		return books;
	}

//	delete a book
	@Transactional
	public void deleteBook(int bid) {
		Book book = this.hibernateTemplate.get(Book.class, bid);
		this.hibernateTemplate.delete(book);
	}

}
