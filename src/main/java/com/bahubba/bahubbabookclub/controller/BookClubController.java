package com.bahubba.bahubbabookclub.controller;

import com.bahubba.bahubbabookclub.model.dto.BookClubDTO;
import com.bahubba.bahubbabookclub.model.payload.NewBookClub;
import com.bahubba.bahubbabookclub.service.BookClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/book-clubs")
public class BookClubController {
    @Autowired
    private BookClubService bookClubService;

    @PostMapping("/create")
    public BookClubDTO create(@RequestBody NewBookClub newBookClub) {
        return bookClubService.create(newBookClub);
    }

    @GetMapping("/{id}")
    public BookClubDTO getByID(@PathVariable  UUID id) {
        return bookClubService.findByID(id);
    }

    @GetMapping("/all")
    public List<BookClubDTO> getAll() {
        return bookClubService.findAll();
    }

    @DeleteMapping("/{id}")
    public BookClubDTO disbandBookClub(@PathVariable UUID id) {
        return bookClubService.disbandBookClub(id);
    }
}
