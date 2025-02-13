package FacadeDesignPattern;

public class VideoFile {
    private String filename;

    public VideoFile(String filename) {
        this.filename = filename;
        System.out.println("VideoFile: Created video file for '" + filename + "'");
    }

    public String getFilename() {
        return filename;
    }
}
