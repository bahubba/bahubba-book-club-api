package com.bahubba.bahubbabookclub.model.mapper;

import com.bahubba.bahubbabookclub.model.dto.ReaderDTO;
import com.bahubba.bahubbabookclub.model.entity.Reader;
import com.bahubba.bahubbabookclub.model.payload.NewReader;
import lombok.Generated;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReaderMapper {
    @Generated
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "memberships", ignore = true)
    @Mapping(target = "joined", ignore = true)
    @Mapping(target = "departed", ignore = true)
    Reader modelToEntity(NewReader newReader);

    @Generated
    ReaderDTO entityToDTO(Reader reader);

    @Generated
    List<ReaderDTO> entityListToDTO(List<Reader> readers);
}
