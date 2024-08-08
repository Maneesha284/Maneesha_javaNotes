package com.ojas.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="order_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_id;
    private int quantity;
    
    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;
 
    @CreationTimestamp
    @Temporal(TemporalType.TIME)
    @Column(name = "ORDER_TIME", updatable = false)
    private Date orderTime;
   
    @UpdateTimestamp
    @Temporal(TemporalType.TIME)
    @Column(name = "ORDER_MODIFIED", insertable = false )
    private Date lastModified;

}
