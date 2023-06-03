package com.bahubba.bahubbabookclub.repository;

import com.bahubba.bahubbabookclub.model.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReaderRepo extends JpaRepository<Reader, UUID> {
}
