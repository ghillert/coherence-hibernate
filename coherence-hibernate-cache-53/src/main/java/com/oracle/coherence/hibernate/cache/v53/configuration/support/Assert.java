/*
 * Copyright (c) 2013, 2021, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * https://oss.oracle.com/licenses/upl.
 */
package com.oracle.coherence.hibernate.cache.v53.configuration.support;

/**
 * Helper class for some common assertions.
 * @author Gunnar Hillert
 * @since 2.1
 */
public abstract class Assert {

	private Assert() {
		throw new AssertionError();
	}

	public static void notNull(Object object, String message) {
		if (object == null) {
			throw new IllegalArgumentException(message);
		}
	}
}