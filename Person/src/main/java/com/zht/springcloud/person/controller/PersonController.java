package com.zht.springcloud.person.controller;

import com.zht.springcloud.person.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    //todo
    @RequestMapping(value = "/save", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> savePerson(@RequestBody String name) {
        Person p = new Person(name);
        List<Person> pList = new ArrayList();
        pList.add(p);
        return pList;
    }
}
