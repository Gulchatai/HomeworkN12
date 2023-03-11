public class Author {
    private final String authorName;
    private final String authorFamily;
    public Author (String authorName, String authorFamily) {
        this.authorName = authorName;
        this.authorFamily = authorFamily;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorFamily() {
        return this.authorFamily;
    }
}
