package FacadeDesignPattern;

// Facade Class
// The facade simplifies the interaction with the complex video conversion framework.


public class VideoConverter {
    /**
     * Converts a video file to the specified format.
     * This method simulates the video conversion process with print statements.
     *
     * @param filename The name of the source video file.
     * @param format   The desired output format (e.g., "mp4" or "ogg").
     */
    public void convert(String filename, String format) {
        System.out.println("VideoConverter: Starting conversion of '" + filename + "' to format '" + format + "'");

        // Create a VideoFile instance from the given filename.
        VideoFile file = new VideoFile(filename);


        ////         Extra Work Starts

        // Simulate extracting the source codec based on the filename.
        String sourceCodec = file.getFilename().toLowerCase().endsWith(".mp4") ? "MPEG4" : "Ogg";
        System.out.println("VideoConverter: Extracted source codec: " + sourceCodec);

        // Determine the destination codec based on the desired format.
        String destinationCodec = format.equalsIgnoreCase("mp4") ? "MPEG4" : "Ogg";
        System.out.println("VideoConverter: Using destination codec: " + destinationCodec);

        ////         Extra Work Ends


        // Simulate the completion of conversion.
        System.out.println("VideoConverter: Conversion completed. Saved as 'converted_" + filename + "." + format + "'");
    }
}

