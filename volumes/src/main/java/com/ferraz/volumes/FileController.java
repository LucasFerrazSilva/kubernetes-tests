package com.ferraz.volumes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class FileController {

    @Value("${file.location}")
    private String fileLocation;

    @Value("${file.name}")
    private String fileName;

    @GetMapping("/write")
    public String write(@RequestParam("text") String text) throws IOException {
        File dir = new File(fileLocation);
        if (!dir.exists())
            Files.createDirectory(dir.toPath());

        File file = getFile();
        if (!file.exists())
            Files.createFile(file.toPath());

        try(FileWriter writer = new FileWriter(file)) {
            writer.write(text);
            return text;
        }
    }

    @GetMapping("/read")
    public String read() throws IOException {
        File file = getFile();

        if (!file.exists())
            return "Arquivo não encontrado!";

        return Files.readString(file.toPath());
    }

    private File getFile() {
        return new File(fileLocation + File.separator + fileName);
    }

}
