package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomCont", types = { Contact.class })
public interface ContactProjection {

	public String getNom();
}
