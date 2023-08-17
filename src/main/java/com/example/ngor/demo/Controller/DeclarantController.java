package com.example.ngor.demo.Controller;

import com.example.ngor.demo.Repository.DeclarantRepository;
import com.example.ngor.demo.model.Declarant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class DeclarantController {


    @Autowired
    DeclarantRepository declarantRepository;


    @GetMapping("/declarants")
    private ResponseEntity<List<Declarant>>getAllDeclarants()
    {
        return new ResponseEntity<>(declarantRepository.findAll(), HttpStatus.OK);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/declarants")
    private ResponseEntity<String> saveUser(@RequestBody Declarant declarantDto)
    {
        //A revoir le repository
        //System.out.println(DeclarantMapper.INSTANCE.toEntity(declarantDto).toString());
        //declarantRepository.save(DeclarantMapper.INSTANCE.toEntity(declarantDto));
        declarantRepository.save(declarantDto);
        //return declarantDto.getId();
        return new ResponseEntity<>("add with success", HttpStatus.OK);
    }
}
