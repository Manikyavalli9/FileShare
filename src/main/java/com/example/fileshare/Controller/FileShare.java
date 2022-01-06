package com.example.fileshare.Controller;

import com.example.fileshare.model.File;
import com.example.fileshare.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FileShare {
//linking to service of file
    @Autowired
    private FileService service;
//it gets all the files
    @GetMapping("/api/file")
    public List<File> getFile() {
        return service.getFile();
    }
//it shows or get specific id of the file
    @GetMapping("/api/file/{id}")
    public ResponseEntity<File> getFileById(@PathVariable(name = "id") String id) {
        return service.getFileById(id);


    }
}
