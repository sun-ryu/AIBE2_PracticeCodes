package java20250513;

import java.awt.print.Book;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[2];
		Book[] bookArray2 = new Book[2];
		
		bookArray1[0] = new Book("�Ű�", "����");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 2);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

	}

}
