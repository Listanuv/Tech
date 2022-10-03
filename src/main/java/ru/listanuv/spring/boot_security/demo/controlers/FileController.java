package ru.listanuv.spring.boot_security.demo.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.listanuv.spring.boot_security.demo.model.File;
import ru.listanuv.spring.boot_security.demo.service.FileService;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/hash")
    public ResponseEntity<String> getCheckSum(@RequestBody File path) {
        try {
            return new ResponseEntity<>(fileService.getCheckSum(path.getPath()), HttpStatus.OK);
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
