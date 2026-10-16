package com.example.facade;

public class BitrateReader {

    public static VideoFile read(
            VideoFile file,
            Codec codec) {

        System.out.println(
                "Reading bitrate using "
                        + codec.getType() +
                        " codec");

        return file;
    }

    public static VideoFile convert(
            VideoFile file,
            Codec destinationCodec) {

        System.out.println(
                "Converting video to "
                        + destinationCodec.getType());

        return file;
    }
}
