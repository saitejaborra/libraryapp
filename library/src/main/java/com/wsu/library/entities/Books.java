package com.wsu.library.entities;

import java.math.BigInteger;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Books {
	
	@Id
	private BigInteger id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	@Column
	private String publisher;
	
	@Column
	private String isbn;
	
	@Column
	private int publicationYear;
	
	@Column
	private int numberOfPages;
	
	@Column
	private int availableCopies;
	

}
