package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by RobertBarber on 6/6/16.
 */
@Controller
public class BookController {
    @Autowired
    BookRepository books;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        List<Book> bookList = (List<Book>) books.findAll();
        model.addAttribute("books", bookList);
        return "home";
    }

    @RequestMapping(path = "/add-book", method = RequestMethod.POST)
    public String addBook(String title, String author, String genre) {
        Book book = new Book(title, author, genre);
        books.save(book);
        return "redirect:/";
    }
}
