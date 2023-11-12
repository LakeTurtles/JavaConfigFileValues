package com.ultima.Senorial.Configuration;


import com.ultima.Senorial.Domain.Person;
import com.ultima.Senorial.Service.FileService1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;

@org.springframework.context.annotation.Configuration
@Profile("developerGroup88")
public class ConfigurationB {


    @Value("${superuser.first.name}")
    private String firstName3;
    @Value("${superuser.last.name}")
    private String lastName3;
    @Value("${superuser.age}")
    private String age3;


    @Value("${superuser.ssn}")
    private String ssn3;



    @Value("${thinkplus.monitor123}")
    private String monitorName;

    @Value("${group.b.users}")
    private ArrayList<String> userList3;



    @Primary
    @Bean
    public FileService1 defaultService() throws Exception{
        return new FileService1("TestTextFile.txt");
    }
    @Bean
    public Person person23 () {
//        return new Person("Dexter", "Manley", 55, 343456);
        System.out.println(monitorName);
        System.out.println(userList3);
        return new Person(firstName3, lastName3, age3, ssn3);
    }
}
