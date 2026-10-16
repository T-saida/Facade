# Assignment 4 – Facade Pattern

## Project Title

Media Conversion Facade

## Description

This project demonstrates the implementation of the Facade Design Pattern in Java.

The Facade pattern provides a simplified interface to a complex subsystem. Instead of interacting directly with multiple conversion-related classes, the client uses a single facade class called `MediaConversionFacade`.

The facade hides the complexity of video conversion and coordinates all subsystem components internally.

## Design Pattern

Structural Pattern: Facade

### Facade

- MediaConversionFacade

### Subsystem Classes

- VideoFile
- CodecFactory
- Codec
- MP4Codec
- OggCodec
- BitrateReader
- AudioMixer

### Client

- Main

## How It Works

The client requests a video conversion:

```java
MediaConversionFacade converter =
        new MediaConversionFacade();

converter.convertVideo(
        "movie.ogg",
        "mp4");
```

The facade then performs the following operations internally:

1. Creates a VideoFile object.
2. Extracts the source codec.
3. Selects the destination codec.
4. Reads bitrate information.
5. Converts the video.
6. Fixes the audio stream.
7. Returns the converted file.

The client does not need to know any details about these steps.

## Project Structure

```text
src
└── main
    └── java
        └── com.example.facade
            ├── Main.java
            ├── MediaConversionFacade.java
            ├── VideoFile.java
            ├── Codec.java
            ├── MP4Codec.java
            ├── OggCodec.java
            ├── CodecFactory.java
            ├── BitrateReader.java
            └── AudioMixer.java
```

## Example Output

```text
Starting conversion...

Extracting codec from movie.ogg
Reading bitrate using ogg codec
Converting video to mp4
Fixing audio

Conversion completed.
```

## Clean Code Principles Used

### 1. Meaningful Names

Class and method names clearly describe their purpose:

- MediaConversionFacade
- CodecFactory
- AudioMixer
- convertVideo()

### 2. Single Responsibility Principle

Each class has one responsibility:

- VideoFile stores file information.
- CodecFactory selects codecs.
- BitrateReader handles bitrate operations.
- AudioMixer processes audio.
- MediaConversionFacade coordinates the workflow.

### 3. Encapsulation

Subsystem details are hidden from the client.

The client interacts only with the facade.

### 4. Small and Focused Methods

Methods perform one specific task and remain easy to understand.

### 5. Low Coupling

The client depends only on the facade rather than multiple subsystem classes.

