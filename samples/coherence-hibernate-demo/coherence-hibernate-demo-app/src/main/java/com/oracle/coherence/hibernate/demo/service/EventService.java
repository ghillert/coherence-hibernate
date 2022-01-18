/*
 * Copyright (c) 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * https://oss.oracle.com/licenses/upl.
 */
package com.oracle.coherence.hibernate.demo.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.oracle.coherence.hibernate.demo.model.Event;

/**
 *
 * @author Gunnar Hillert
 *
 */
public interface EventService {

	/**
	 *
	 * @return
	 */
	Page<Event> listEvents(Pageable pageable);

	/**
	 *
	 * @param title
	 * @param date
	 * @return
	 */
	Long createAndStoreEvent(String title, Date date);

	Event getEvent(Long id);

}
