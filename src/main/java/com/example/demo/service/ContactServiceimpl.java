package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Contact;
import com.example.demo.repos.ContactRepository;

@Service
public class ContactServiceimpl implements ContactService {

	
	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public Contact saveContact(Contact p) {
		
		return contactRepository.save(p);
	}

	@Override
	public Contact updateContact(Contact p) {

         return contactRepository.save(p);
	}

	@Override
	public void deleteContact(Contact p) {
	 contactRepository.delete(p);

	}

	@Override
	public void deleteContactById(Long id) {
		contactRepository.deleteById(id);

		
	}

	@Override
	public Contact getContact(Long id) {
		return contactRepository.findById(id).get();
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	
	@Override
	public List<Contact> findByNom(String nom) {
		return contactRepository.findByNom(nom);
	}

	@Override
	public List<Contact> findByNomContains(String nom) {
		return contactRepository.findByNomContains(nom);
	}

	@Override
	public List<Contact> findByNomEmail(String nom, String email) {
		return contactRepository.findByNomEmail(nom,email);
	}

	@Override
	public List<Contact> findByCategorie(Categorie categorie) {
		return contactRepository.findByCategorie(categorie);
	}

	@Override
	public List<Contact> findByCategorieIdCat(Long id) {
		return contactRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Contact> findByOrderByNomAsc() {
		return contactRepository.findByOrderByNomAsc();
	}

	@Override
	public List<Contact> trierContactsNomsEmail() {
		return contactRepository.trierContactsNomsEmail();
	}

}
