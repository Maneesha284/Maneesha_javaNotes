package com.ojas.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOK_TABLS")
public class BookEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "BOOK_ID")
	private int bookId;
@Column(name = "BOOK_NAME")
	private String bookName;
@Column(name = "AUTHOR_NAME")
private String authorName;
@Column(name = "BOOK_PRICE")
	private double bookPrice;
}
