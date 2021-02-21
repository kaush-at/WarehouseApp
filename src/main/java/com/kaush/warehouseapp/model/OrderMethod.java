package com.kaush.warehouseapp.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="order_method_tab")
public class OrderMethod {

	@Id
	@GeneratedValue
	@Column(name="ord_id_col")
	private Integer id;
	
	@Column(name="ord_mode_col")
	private String orderMode;
	
	@Column(name="ord_code_col")
	private String orderCode;
	
	@Column(name="ord_type_col")
	private String orderType;
	
	@ElementCollection
	@CollectionTable(name="ord_accept_tab",
	joinColumns = @JoinColumn(name="ord_id_col"))
	// the above @ElementCollection and @CollectionTable line is compulsory for collection type column
	@Column(name="ord_accept_col")
	private Set<String> orderAccept;
	
	@Column(name="ord_desc_col")
	private String decription;
	
}
