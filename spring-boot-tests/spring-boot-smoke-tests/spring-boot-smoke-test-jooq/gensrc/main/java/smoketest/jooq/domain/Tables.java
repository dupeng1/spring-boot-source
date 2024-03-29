/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This class is generated by jOOQ
 */
package smoketest.jooq.domain;

import javax.annotation.Generated;

/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(value = {"https://www.jooq.org",
		"jOOQ version:3.8.2"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables {

	/**
	 * The table <code>PUBLIC.LANGUAGE</code>.
	 */
	public static final Language LANGUAGE = Language.LANGUAGE;

	/**
	 * The table <code>PUBLIC.AUTHOR</code>.
	 */
	public static final Author AUTHOR = Author.AUTHOR;

	/**
	 * The table <code>PUBLIC.BOOK</code>.
	 */
	public static final Book BOOK = Book.BOOK;

	/**
	 * The table <code>PUBLIC.BOOK_STORE</code>.
	 */
	public static final BookStore BOOK_STORE = BookStore.BOOK_STORE;

	/**
	 * The table <code>PUBLIC.BOOK_TO_BOOK_STORE</code>.
	 */
	public static final BookToBookStore BOOK_TO_BOOK_STORE = BookToBookStore.BOOK_TO_BOOK_STORE;

}
