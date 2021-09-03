package kr.or.shi.objectArray;

public class ObjectCopy2 {

    //  깊은 복사
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");
		
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

		// System.arraycopy(library, 0, copyLibrary, 0, library.length);

        for(int i = 0; i < library.length; i++)
        {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setAuthor("야마모토 유스케");
        library[0].setTitle("인텔리제이 IDEA");

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
