package com.example.facade;

public class Main {

    public static void main(String[] args) {

        MediaConversionFacade converter =
                new MediaConversionFacade();

        converter.convertVideo(
                "movie.ogg",
                "mp4");
    }
}
