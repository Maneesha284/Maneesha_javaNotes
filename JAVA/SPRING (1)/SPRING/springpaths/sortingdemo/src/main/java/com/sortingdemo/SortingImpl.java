package com.sortingdemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SortingImpl {
	
	@Autowired
	@Qualifier("567")
	private Sorter sorter;
	
	public void sort(int[] data) {
		sorter.sort(data);
	}

}
