package practice_books_management;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
	int id;
	String name;
	Author[] authors;
	Publisher publisher;
	int publishingYear;
	int amountOfPages;
	BigDecimal price;
	CoverType coverType;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(amountOfPages, coverType, id, name, price, publisher, publishingYear);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return amountOfPages == other.amountOfPages && Arrays.equals(authors, other.authors)
				&& Objects.equals(coverType, other.coverType) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}
}
