/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query;

/**
 * The kind of type of a cast target.
 *
 * @see CastType
 *
 * @author Christian Beikov
 */
public enum CastTypeKind {
	BOOLEAN,
	NUMERIC,
	TEMPORAL,
	TEXT
}