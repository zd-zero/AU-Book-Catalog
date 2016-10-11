package zero.zd.aubookcatalog.model;

import zero.zd.aubookcatalog.ZHelper;

public class BookGridModel {

    private long bookId;
    private String bookImage;
    private String bookTitle;
    private String author;
    private String bookType;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        String bookPath = "/book_img/";
        this.bookImage = ZHelper.getInstance().getServer() + bookPath + bookImage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
