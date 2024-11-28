package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Contact;
import com.example.demo.repos.ContactRepository;

@SpringBootTest
class DemoApplicationTests {


	@Autowired
	private ContactRepository contactRepository;
	@Test
	public void testCreateContact() {
		Contact prod = new Contact("mouna","mouna@gmail.com",new Date());
	contactRepository.save(prod);
	}
	
	
	@Test
	public void testFindContact()
	{
		Contact p =contactRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateContact()
	{
		Contact p = contactRepository.findById(1L).get();
	p.setNom("Ahmed");
	contactRepository.save(p);
	}
	
	@Test
	public void testDeleteContact()
	{
		contactRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousContacts()
	{
	List<Contact> prods = contactRepository.findAll();
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	}
	
	
	
	@Test
	public void testFindByNom()
	{
	List<Contact> prods = contactRepository.findByNom("Ahmed");
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomContains()
	{
	List<Contact> prods=contactRepository.findByNomContains("Ah");
	for (Contact p : prods)
	{
	System.out.println(p);
	} }
	
	
	@Test
	public void testfindByNomEmail()
	{
	List<Contact> prods = contactRepository.findByNomEmail("Ahmed","ahmed@gmail.com");
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List<Contact> prods = contactRepository.findByCategorie(cat);
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	}

	@Test
	public void findByCategorieIdCat()
	{
	List<Contact> prods = contactRepository .findByCategorieIdCat(1L);
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	 }
	
	@Test
	public void testfindByOrderByNomAsc()
	{
	List<Contact> prods =
			contactRepository.findByOrderByNomAsc();
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testTrierProduitsNomsEmail()
	{
	List<Contact> prods = contactRepository.trierContactsNomsEmail();
	for (Contact p : prods)
	{
	System.out.println(p);
	}
	}

	
	




}
