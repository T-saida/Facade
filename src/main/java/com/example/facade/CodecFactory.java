package com.example.facade;

public class CodecFactory {

    public static Codec extract(VideoFile file) {

        System.out.println(
                "Extracting codec from "
                        + file.getName());

        if ("mp4".equalsIgnoreCase(file.getFormat())) {
            return new MP4Codec();
        }

        return new OggCodec();
    }
}