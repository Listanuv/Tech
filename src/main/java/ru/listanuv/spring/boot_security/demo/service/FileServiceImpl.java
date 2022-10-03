package ru.listanuv.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public String getCheckSum(String path) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        try (DigestInputStream dis = new DigestInputStream(new FileInputStream(path), md)) {
            while (dis.read() != -1) ;
            md = dis.getMessageDigest();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder result = new StringBuilder();
        for (byte b : md.digest()) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
