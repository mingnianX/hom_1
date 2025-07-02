package ynu.hom.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ynu.hom.entity.Book;
import ynu.hom.entity.User;
import ynu.hom.feign.ServiceProviderService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private ServiceProviderService serviceInstance;


    @GetMapping("/getBookById/{userId}")
    public Book getBookById(@PathVariable("userId") Integer userId){

        Book book = new Book();
        List<String> books = new ArrayList<>();
        books.add("高等数学");
        books.add("数据结构");
        books.add("离散数学");
        book.setBookList(books);
        User user = serviceInstance.GetUserById(userId);
        book.setUser(user);
        return book;
    }
}
