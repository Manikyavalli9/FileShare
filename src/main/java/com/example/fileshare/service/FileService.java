package com.example.fileshare.service;

import com.example.fileshare.model.File;
import com.example.fileshare.repository.Filerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class FileService {
//auto linking to repo for db connection
    @Autowired
    private Filerepo fileRepo;

    public List<File> getFile() {
        List<File> list = new ArrayList<>();
        fileRepo.findAll().stream().collect(Collectors.toList());
        return list;
    }

    public ResponseEntity<File> getFileById(String id) {
        Optional<File> optional = fileRepo.findById(id);

        if (optional.isPresent()) {
            File file = (File) fileRepo.getById(id);
            return new ResponseEntity<>(file, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
}
