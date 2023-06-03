package com.bahubba.bahubbabookclub.model.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ReaderDTO {
    private UUID id;
    private String username;
    private String email;
    private String givenName;
    private String middleName;
    private String surname;
    private String suffix;
    private String title;
    private LocalDateTime joined;
    private LocalDateTime departed;
}
