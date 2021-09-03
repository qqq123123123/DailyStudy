package kr.or.shi.objectArray;

	//	얕은 복사
	
public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");
		
		library[0].setTitle("인텔리제이IDEA");
		library[0].setAuthor("야마모토 유스케");

		System.arraycopy(library, 0, copyLibrary, 0, library.length);

		for(Book book : library)
		{
			book.showBookInfo();
		}
		for(Book book : copyLibrary)
		{
			book.showBookInfo();
		}

	}

}
