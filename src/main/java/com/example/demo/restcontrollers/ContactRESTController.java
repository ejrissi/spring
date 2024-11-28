package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contact;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class ContactRESTController {
	@Autowired
	ContactService contactService;
	 
	@RequestMapping(method = RequestMethod.GET)
	public List<Contact> getAllContacts() {
	return contactService.getAllContacts();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Contact getContactById(@PathVariable("id") Long id) {
	return contactService.getContact(id);
	 }
	

	@RequestMapping(method = RequestMethod.POST)
	public Contact createProduit(@RequestBody Contact contact) {
	return contactService.saveContact(contact);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Contact updateContact(@RequestBody Contact produit) {
	return contactService.updateContact(produit);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") Long id)
	{
		contactService.deleteContactById(id);
	}
	
	@RequestMapping(value="/contscat/{idCat}",method = RequestMethod.GET)
	public List<Contact> getContactsByCatId(@PathVariable("idCat") Long idCat) {
	return contactService.findByCategorieIdCat(idCat);
	}


}
