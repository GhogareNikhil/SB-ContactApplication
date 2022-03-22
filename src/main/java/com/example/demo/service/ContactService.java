package com.example.demo.service;

import java.util.List;

import com.example.demo.bindings.ContactForm;

public interface ContactService {

	 public String saveContact(ContactForm form);
	 public List<ContactForm> viewContacts();
	 public ContactForm editContact(Integer contactId);
	 public List<ContactForm> deleteContact(Integer contaId);
}
