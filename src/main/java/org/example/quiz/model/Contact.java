package org.example.quiz.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private Long id;
    private String firstname;
    private String lastname;
    private String company;
    private String jobTitle;

    private List<PhoneNumber> phoneNmberList;

    private List<EmailAddress> emailAddressList;
}