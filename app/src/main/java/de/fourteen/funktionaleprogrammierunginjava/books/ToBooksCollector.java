package de.fourteen.funktionaleprogrammierunginjava.books;

import java.util.stream.Collector;

interface ToBooksCollector extends Collector<Book, Books, Books> {
}
