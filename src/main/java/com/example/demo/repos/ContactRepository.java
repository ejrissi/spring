package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Contact;

@RepositoryRestResource(path="rest")

public interface ContactRepository extends JpaRepository<Contact, Long> {

	List<Contact> findByNom(String nom);
	List<Contact> findByNomContains(String nom); 
	 
	 
	 
	/*
	 *  @Query("select p from Contact p where p.nom like %?1 and p.email like %?2")
	 List<Contact> findByNomEmail (String nom, String email);  
	 */
	 
	 @Query("select p from Contact p where p.nom like %:nom and p.email like %:email ")
	 List<Contact> findByNomEmail(@Param("nom") String nom,@Param("email") String email);

	 @Query("select p from Contact p where p.categorie = ?1")
	 List<Contact> findByCategorie (Categorie categorie);

	 List<Contact> findByCategorieIdCat(Long id);
	 
	 List<Contact> findByOrderByNomAsc();
	 
	 @Query("select p from Contact p order by p.nom ASC, p.email DESC")
	 List<Contact> trierContactsNomsEmail ();
}
