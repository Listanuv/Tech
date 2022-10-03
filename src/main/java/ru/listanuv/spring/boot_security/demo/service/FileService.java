package ru.listanuv.spring.boot_security.demo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public interface FileService {
    String getCheckSum(String path) throws FileNotFoundException, IOException, NoSuchAlgorithmException;
}
