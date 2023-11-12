package com.ultima.Senorial.Service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
// New Instance of the Object when AutoWiring. Creating Singletons./
@Scope("prototype")
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FileService1 {
    private String fileName;

    public FileService1() {
    }

    public FileService1(String fileName){
        if(fileName.equals("TestTextFile.txt")){
            this.fileName = fileName;
        }
        else {
            this.fileName = "defaultFile.txt";
        }


    }

    public List<String> readFile () throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }
}
