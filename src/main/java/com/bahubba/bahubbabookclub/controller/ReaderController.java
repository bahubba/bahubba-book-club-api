package com.bahubba.bahubbabookclub.controller;

import com.bahubba.bahubbabookclub.model.dto.ReaderDTO;
import com.bahubba.bahubbabookclub.model.payload.NewReader;
import com.bahubba.bahubbabookclub.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/readers")
public class ReaderController {
    @Autowired
    private ReaderService readerService;

    @PostMapping("/create")
    public ReaderDTO create(@RequestBody NewReader newReader) {
        return readerService.create(newReader);
    }

    @GetMapping("/{id}")
    public ReaderDTO getByID(@PathVariable UUID id) {
        return readerService.findByID(id);
    }

    @GetMapping("/all")
    public List<ReaderDTO> getAll() {
        return readerService.findAll();
    }

    @DeleteMapping("/{id}")
    public ReaderDTO removeReader(@PathVariable UUID id) {
        return readerService.removeReader(id);
    }
}
