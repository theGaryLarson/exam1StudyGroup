package com.exam1.multidimensionalArrays;

public class MultiDimArrays {
    /** rectangular array with 5 rows of books
     *  each row containing 3 books
     */
    public static void main(String[] args) {
        Book[][] bookshelf = new Book[5][3];
        for (int row = 0; row < bookshelf.length; row++) {
            for (int book = 0; book < bookshelf[row].length; book++) {
                bookshelf[row][book] = new Book((row + 1) * 100);
            }
        }
        //assigning a row to its own array
        Book[] firstRow = bookshelf[0];  // first row
        Book[] secondRow = bookshelf[1]; // second row
        Book[] fifthRow = bookshelf[4];  // fifth row
        
        //using for-each loop to print page count
        for(Book b : firstRow) {
            System.out.println(b.pageCount);
        }
        //for-each loop to iterate over each row(an array)
        for(Book[] row : bookshelf) {
            //nested for-each loop to iterate over each book in each row
            for(Book book : row) {
                System.out.println(book.pageCount);
            }
        }
        
        /* accessing Books in a 2d array */
        
        //first book in first array
        System.out.println(bookshelf[0][0].pageCount);
        //second book in first array
        System.out.println(bookshelf[0][1].pageCount);
        //3rd book in 3rd array
        System.out.println(bookshelf[2][2].pageCount);
    
        /* jagged array example */
        
        //3 piles of books with intention of putting:
        // 5 books in 1st pile, 3 books in 2nd pile, 2 books in 3rd pile
        /* initializing a jagged array */
        Book[][] pileOfBooks = new Book[3][];
        pileOfBooks[0] = new Book[5]; // first pile  ---- declaring intention of how many books in each pile
        pileOfBooks[1] = new Book[3]; // second pile ---- but no books have been created yet.
        pileOfBooks[2] = new Book[2]; // third pile  ---- The books are created after declaring intention.
    
        /* creating books in the jagged array */
        for (int pile = 0; pile < pileOfBooks.length; pile++) { //number of piles
            for (int book = 0; book < pileOfBooks[pile].length; book++) { // amount of books in each pile
                pileOfBooks[pile][book] = new Book((pile+1) * 100); //creating a book (putting it in the pile)
            }
        }
        System.out.println("--Jagged Arrays--");
        for(Book[] pile : pileOfBooks) { // for-each pile of books
            for(Book book : pile) {      // for-each book in pile
                System.out.println(book.pageCount);
            }
        }
        System.out.println();
    }
    
}
