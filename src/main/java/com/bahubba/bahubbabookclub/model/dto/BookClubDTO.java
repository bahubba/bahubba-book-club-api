package com.bahubba.bahubbabookclub.model.dto;

import com.bahubba.bahubbabookclub.model.enums.Publicity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BookClubDTO {
    private UUID id;
    private String name;
    private String imageURL;
    private String description;
    private Publicity publicity;
    private LocalDateTime created;
    private LocalDateTime disbanded;
}
