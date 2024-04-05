package org.example.quiz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.quiz.model.Contact;
import org.example.quiz.model.EmailAddress;
import org.example.quiz.model.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class QuizApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(QuizApplication.class, args);

        Contact contact = new Contact();
        contact.setFirstname("John");
        contact.setLastname("Arku");
        contact.setCompany("XYZ");
        contact.setJobTitle("Software Engineer");


        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("123-456-7890");
        phoneNumber.setLabel("Mobile");

        contact.setPhoneNmberList(new ArrayList<PhoneNumber>());
        contact.getPhoneNmberList().add(phoneNumber);

        EmailAddress emailAddress = new EmailAddress();
        System.out.println("Hello World");
        emailAddress.setAddress("john.arku@gmail.com");
        emailAddress.setLabel("Work");

        contact.setEmailAddressList(new ArrayList<>());
        contact.getEmailAddressList().add(emailAddress);

        ObjectMapper objectMapper = new ObjectMapper();
        String contactJson = objectMapper.writeValueAsString(contact);
        System.out.println(contactJson);





    }

}
