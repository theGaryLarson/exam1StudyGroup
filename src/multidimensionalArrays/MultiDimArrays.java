package multidimensionalArrays;

public class MultiDimArrays {
    /** rectangular array with 5 rows of books */
    public static void main(String[] args) {
        Book[][] bookshelf = new Book[5][3];
        for (int row = 0; row < bookshelf.length; row++) {
            for (int book = 0; book < bookshelf[row].length; book++) {
                bookshelf[row][book] = new Book((row + 1) * 100);
            }
        }
        Book[] firstRow = bookshelf[0];
        Book[] secondRow = bookshelf[1];
        Book[] fifthRow = bookshelf[4];
        for(Book b : firstRow) {
            System.out.println(b.pageCount);
        }
        for(Book[] row : bookshelf) {
            for(Book book : row) {
                System.out.println(book.pageCount);
            }
        }
        //accessing Books(objects) in a 2d array
        //first book in first array
        System.out.println(bookshelf[0][0].pageCount);
        //second book in first array
        System.out.println(bookshelf[0][1].pageCount);
        //3rd book in 3rd array
        System.out.println(bookshelf[2][2].pageCount);
        /** jagged array example */
        //pile of books from worm's eye view
        Book[][] pileOfBooks = new Book[3][];
        pileOfBooks[0] = new Book[5];
        pileOfBooks[1] = new Book[3];
        pileOfBooks[2] = new Book[2];
    
        for (int row = 0; row < pileOfBooks.length; row++) {
            for (int book = 0; book < pileOfBooks[row].length; book++) {
                pileOfBooks[row][book] = new Book((row + 1) * 100);
            }
        }
        System.out.println("--Jagged Arrays--");
        for(Book[] row : pileOfBooks) {
            for(Book book : row) {
                System.out.println(book.pageCount);
            }
        }
        System.out.println();
    }
    //At this point we have 5 null arrays of books indexes 0 through 4.
}
