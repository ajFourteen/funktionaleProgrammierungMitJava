package de.fourteen.funktionaleprogrammierunginjava.books;

import java.util.function.Predicate;

interface IsAGoodBook extends Predicate<Book> {
    IsAGoodBook IS_A_GOOD_BOOK = book ->
            book.authorNameStartsWith("A") &&
                    book.isTitleLength(42) &&
                    book.wasPublishedIn(new YearOfPublication(2016));
}
