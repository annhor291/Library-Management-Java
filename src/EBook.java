public class EBook extends Book {
    private String fileFormat;
    private double fileSize;

    public EBook() {

    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " | Định dạng: " + fileFormat + ", Kích thước: " + fileSize;
    }
}
