package com.idho.routingapps.controller;
import com.idho.routingapps.entity.User;
import com.idho.routingapps.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Idho
 */
//@Slf4j
@RestController
@RequestMapping("/api")
public class RoutingMethod {
    //    auto wired digunakan untuk
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        String nama = "Bayu";
        return new ResponseEntity<>(nama, HttpStatus.OK);
    }

    @GetMapping("/all_data")
    public ResponseEntity<?> allData(){
//        List<User> users = userRepository.findAll();
//
//        if (users.isEmpty()) {
//            log.info("KOSONG");
//            users = new ArrayList<>();
//        }

        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
//     @GetMapping("/all_data")
//    public ResponseEntity<?> allData(){
//        List<User> users = userRepository.findAll();
//        if (!userRepository.findAll().isEmpty()) {
//
//        }
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }
}
