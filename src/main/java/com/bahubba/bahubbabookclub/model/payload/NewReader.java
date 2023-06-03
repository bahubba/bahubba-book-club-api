package com.bahubba.bahubbabookclub.model.payload;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class NewReader {
    private String username;
    private String email;
    private String givenName;
    private String middleName;
    private String surname;
    private String suffix;
    private String title;
}
