package org.example.quiz.service;

import org.example.dao.ContactRepository;
import org.example.quiz.model.Contact;

import java.util.List;

public class ContactService {
    private ContactRepository contactRepository;
    public List<Contact> getAllContacts(){
        return contactRepository.getAllContacts();
    }

    public void updateContact(Contact contact) {

    }

    public void deleteContact(Long id) {

    }
}
