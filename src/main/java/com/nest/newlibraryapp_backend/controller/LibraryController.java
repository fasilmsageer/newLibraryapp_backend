package com.nest.newlibraryapp_backend.controller;

import com.nest.newlibraryapp_backend.dao.BooksDao;
import com.nest.newlibraryapp_backend.dao.UserregistrationDao;
import com.nest.newlibraryapp_backend.model.Books;
import com.nest.newlibraryapp_backend.model.Userregistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private BooksDao dao;
    private UserregistrationDao doa;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addbook", consumes = "application/json", produces = "application/json")
    public String addbook(@RequestBody Books b){
        System.out.println(b.getTitle().toString());
        dao.save(b);
        return "Book added Successfully";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchbook", consumes = "application/json", produces = "application/json")
    public List<Books> searchbook(@RequestBody Books b){
        String title = String.valueOf(b.getTitle()) ;
        System.out.println(title);
        return (List<Books>) dao.SearchBook(b.getTitle());

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewbook")
    public List<Books> viewbook(){
        return (List<Books>) dao.findAll();
    }

    @CrossOrigin
    @PostMapping(path= "/deletebook", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deletebook(@RequestBody Books b){
        String bookid=String.valueOf(b.getId());
        System.out.println(bookid);
        dao.DeleteBook(b.getId());
        HashMap<String ,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser", consumes = "application/json", produces = "application/json")
    public String adduser(@RequestBody Userregistration u){
        System.out.println(u.getUsername().toString());
        doa.save(u);
        return "User added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<Userregistration> viewuser(){
        return (List<Userregistration>) doa.findAll();
    }

    @CrossOrigin
    @PostMapping(path= "/deleteuser", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deleteuser(@RequestBody Userregistration u){
        String userid=String.valueOf(u.getId());
        System.out.println(userid);
        doa.DeleteUser(u.getId());
        HashMap<String ,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

}
