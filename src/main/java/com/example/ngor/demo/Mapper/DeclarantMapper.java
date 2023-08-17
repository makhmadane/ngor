package com.example.ngor.demo.Mapper;


import com.example.ngor.demo.Dto.DeclarantDto;
import com.example.ngor.demo.model.Declarant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DeclarantMapper {

    DeclarantMapper INSTANCE = Mappers.getMapper(DeclarantMapper.class);
    Declarant toEntity(DeclarantDto declarantDto);
}