package com.bahubba.bahubbabookclub.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "reader")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    private UUID id;

    @Column(nullable = false, unique = true)
    @NotNull
    private String username;

    @Column(nullable = false, unique = true)
    @NotNull
    private String email;

    @Column(name = "given_name")
    private String givenName;

    @Column(name = "middle_name")
    private String middleName;

    @Column
    private String surname;

    @Column
    private String suffix;

    @Column
    private String title;

    @Column(nullable = false)
    @NotNull
    @Builder.Default
    private LocalDateTime joined = LocalDateTime.now();

    @Column
    private LocalDateTime departed;
}
