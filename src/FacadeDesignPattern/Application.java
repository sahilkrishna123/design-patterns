package FacadeDesignPattern;

// Client Class

public class Application {
    public static void main(String[] args) {
        // Create the facade instance.
        VideoConverter converter = new VideoConverter();

        // Use the facade to convert a video file.
        converter.convert("youtubevideo.ogg", "mp4");
    }
}

