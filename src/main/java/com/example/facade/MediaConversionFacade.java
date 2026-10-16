package com.example.facade;

public class MediaConversionFacade {

    public VideoFile convertVideo(
            String fileName,
            String format) {

        System.out.println(
                "\nStarting conversion...");

        VideoFile file =
                new VideoFile(fileName);

        Codec sourceCodec =
                CodecFactory.extract(file);

        Codec destinationCodec;

        if ("mp4".equalsIgnoreCase(format)) {
            destinationCodec = new MP4Codec();
        } else {
            destinationCodec = new OggCodec();
        }

        VideoFile buffer =
                BitrateReader.read(
                        file,
                        sourceCodec);

        VideoFile intermediateResult =
                BitrateReader.convert(
                        buffer,
                        destinationCodec);

        AudioMixer mixer =
                new AudioMixer();

        VideoFile result =
                mixer.fix(intermediateResult);

        System.out.println(
                "Conversion completed.");

        return result;
    }
}