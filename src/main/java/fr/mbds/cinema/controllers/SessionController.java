package fr.mbds.cinema.controllers;

import fr.mbds.cinema.entitites.Session;
import fr.mbds.cinema.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SessionController {

    @Autowired
    SessionRepository sessionRepository;

    @GetMapping("/sessions")
    public List<Session> getSessions() {
        return sessionRepository.findAll();
    }


}
