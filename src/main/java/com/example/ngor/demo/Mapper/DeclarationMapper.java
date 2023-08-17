package com.example.ngor.demo.Mapper;


import com.example.ngor.demo.Dto.DeclarationDto;
import com.example.ngor.demo.Repository.DeclarantRepository;
import com.example.ngor.demo.model.Declaration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = { DeclarantRepository.class })
public interface DeclarationMapper {
    @Mapping(source = "declarant_id", target = "declarant")
    Declaration toEntity(DeclarationDto schoolDTO);



}