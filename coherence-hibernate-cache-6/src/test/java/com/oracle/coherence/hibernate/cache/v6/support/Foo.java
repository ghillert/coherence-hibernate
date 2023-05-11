/*
 * Copyright (c) 2013, 2021, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * https://oss.oracle.com/licenses/upl.
 */
package com.oracle.coherence.hibernate.cache.v6.support;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import java.io.Serializable;

/**
 * @author Gunnar Hillert
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "foo")
@NamedQueries(@NamedQuery(name = "fooQuery", query = "from Foo where name like :name"))
public class Foo implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public Foo() {
	}

	public Foo(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}