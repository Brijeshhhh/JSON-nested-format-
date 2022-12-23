package com.demo.artifact;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("book")
public class BookDetails {
	
	BookRepository repo=new BookRepository(); 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getDetails(){
		System.out.println("CAlled");
		return repo.getBookDetails();
	}
	@GET
	@Path("book-id/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Book getDetail(@PathParam("id") int id) {
		return repo.getBookdetail(id);
	}
	
	


		   
	
}
