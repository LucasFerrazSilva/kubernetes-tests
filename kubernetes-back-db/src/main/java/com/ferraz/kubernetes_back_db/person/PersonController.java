package com.ferraz.kubernetes_back_db.person;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;


    @GetMapping
    public ResponseEntity<List<Person>> list() {
        return ResponseEntity.ok(personRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestParam("name") String name) {
        Person person = new Person();
        person.setName(name);
        personRepository.save(person);
        return ResponseEntity.ok(person);
    }

}
