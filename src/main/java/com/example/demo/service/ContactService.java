package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Contact;

public interface ContactService {

	
		Contact saveContact(Contact p);
		Contact updateContact(Contact p);
		void deleteContact(Contact p);
		 void deleteContactById(Long id);
		 Contact getContact(Long id);
		List<Contact> getAllContacts();
	
		List<Contact> findByNom(String nom);
		List<Contact> findByNomContains(String nom);
		List<Contact> findByNomEmail (String nom, String email);
		List<Contact> findByCategorie (Categorie categorie);
		List<Contact> findByCategorieIdCat(Long id);
		List<Contact> findByOrderByNomAsc();
		List<Contact> trierContactsNomsEmail();

}
