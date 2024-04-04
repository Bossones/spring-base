package ru.bossones.test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {

        try (
            var readChannel = Files.newByteChannel(Paths.get("src/main/resources/testFileToSend.txt"), StandardOpenOption.READ);
            var writeChannel = Files.newBufferedWriter(Paths.get("src/main/resources/base64ToSend.txt"), StandardOpenOption.CREATE_NEW)
        ) {
            var buffer = ByteBuffer.allocate(1024);
            readChannel.read(buffer);
            var base64String = Base64.getEncoder().encodeToString(buffer.array());
            writeChannel.write(base64String);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
