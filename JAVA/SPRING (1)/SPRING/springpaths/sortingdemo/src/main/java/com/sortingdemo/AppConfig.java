package com.sortingdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean(name="123")
	@Primary
	public Sorter bubbleSorter(){
		Sorter bubblesorter = new BubbleSorter();
		return bubblesorter;
	}
	
	@Bean("567")
	public Sorter quickSorter(){
		Sorter quicksorter = new QuickSorter();
		return quicksorter;
	}
	
	@Bean
	public SortingImpl sortingImpl() {
		return new SortingImpl();
	}

}
