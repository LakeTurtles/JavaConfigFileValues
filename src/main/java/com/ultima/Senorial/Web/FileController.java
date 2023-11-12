package com.ultima.Senorial.Web;

import com.ultima.Senorial.Domain.Person;
import com.ultima.Senorial.Service.FileService1;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController {

@Autowired
private Person person33;
    @Autowired
private Person person66;
    @Autowired
private Person person77;



private Person person44 = new Person("John", "Smith", "39", "9999");

private Person person55 = new Person();

    @Autowired
    private FileService1 fileServiceA ;



    @GetMapping("darktransaction")
    public List<String> readLines () throws IOException {

        System.out.println("Person 55 = " + person55);
        System.out.println("Person 66 = " + person66);
        System.out.println("Person 77 = " + person77);


        if (person33.getFirstName().equals("Dexter") && person33.getAge() == 55){
            System.out.println( "Credentials were Loaded From Configuration. = " + person33);
        } else {
            System.out.println("Credentials were not Loaded so we used default John" + person44);
        }

        return fileServiceA.readFile();
    }




}
