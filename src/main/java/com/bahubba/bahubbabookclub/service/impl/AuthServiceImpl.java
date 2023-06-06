package com.bahubba.bahubbabookclub.service.impl;

import com.bahubba.bahubbabookclub.config.JWTService;
import com.bahubba.bahubbabookclub.model.dto.AuthDTO;
import com.bahubba.bahubbabookclub.model.entity.Reader;
import com.bahubba.bahubbabookclub.model.mapper.ReaderMapper;
import com.bahubba.bahubbabookclub.model.payload.AuthRequest;
import com.bahubba.bahubbabookclub.model.payload.NewReader;
import com.bahubba.bahubbabookclub.repository.ReaderRepo;
import com.bahubba.bahubbabookclub.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class AuthServiceImpl implements AuthService {

    private final ReaderRepo readerRepo;

    private final ReaderMapper readerMapper;

    private final JWTService jwtService;

    private final AuthenticationManager authManager;

    public AuthDTO register(NewReader newReader) {
        Reader reader = readerMapper.modelToEntity(newReader);
        log.info("reader: " + reader);
        reader = readerRepo.save(reader);

        String jwtToken = jwtService.generateToken(reader);

        return AuthDTO.builder().token(jwtToken).build();
    }

    public AuthDTO authenticate(AuthRequest req) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsernameOrEmail(), req.getPassword()));

        // TODO - Custom exception
        Reader reader = readerRepo.findByUsernameOrEmail(req.getUsernameOrEmail(), req.getUsernameOrEmail())
            .orElseThrow();

        String jwtToken = jwtService.generateToken(reader);

        return AuthDTO.builder().token(jwtToken).build();
    }
}
