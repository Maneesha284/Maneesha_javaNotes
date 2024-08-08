package com.ojas.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private int bookId;
		private String bookName;
	private String authorName;
		private double bookPrice;
}
