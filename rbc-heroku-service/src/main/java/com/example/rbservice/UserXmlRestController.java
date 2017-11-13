package com.example.rbservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/robotxml")
public class UserXmlRestController {

    @Autowired
    UserRestResource userRestResource;

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping(path ="/robot/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> get(@PathVariable Long id) {
        return new ResponseEntity<Optional<Robot>>(userRestResource.findById(id), HttpStatus.OK);
    }

    //@PreAuthorize("hasRole('ROLE_USER')")
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping(path ="/robots", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<List<Robot>>(userRestResource.findAll(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping(path ="/robot/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void delete(@PathVariable Long id) {
        userRestResource.deleteById(id);
   }




}
