package org.example.quiz.controller;

import org.example.quiz.model.Contact;
import org.example.quiz.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    private ContactService contactService;


    @GetMapping
    public List<Contact> getAllContact(){
        return contactService.getAllContacts();

    }
    @PutMapping
    public void updateContact(@RequestBody Contact contact){
        contactService.updateContact(contact);
    }
    @DeleteMapping("{id}")
    public void deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
    }
}
