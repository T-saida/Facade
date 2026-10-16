package com.example.facade;

public class VideoFile {

    private String name;
    private String format;

    public VideoFile(String name) {
        this.name = name;

        int dotIndex = name.lastIndexOf('.');

        this.format = dotIndex > 0
                ? name.substring(dotIndex + 1)
                : "";
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }
}