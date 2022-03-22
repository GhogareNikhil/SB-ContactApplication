package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bindings.ContactForm;
import com.example.demo.service.ContactService;

@RestController
public class ContactRestController {
	
	@Autowired
	private ContactService coService;

	@PostMapping("/save")
	public String saveContact(@RequestBody ContactForm form) {
		System.out.println(form);
		String status = coService.saveContact(form);
		return status;
	}

	@GetMapping("/contacts")
	public List<ContactForm> viewContacts() {
		System.out.println("***View all contacts***");
		return coService.viewContacts();
	}

	@GetMapping("/editContact/{contactId}")
	public ContactForm editContact(@PathVariable Integer contactId) {
		return coService.editContact(contactId);
	}
	
	@DeleteMapping("deleteContact/{contactId}")
	public List<ContactForm> deleteContact(@PathVariable Integer contactId) {
		return coService.deleteContact(contactId);
	}
}
