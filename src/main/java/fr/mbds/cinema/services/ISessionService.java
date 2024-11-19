package fr.mbds.cinema.services;

import fr.mbds.cinema.dtos.SessionDto;
import fr.mbds.cinema.entitites.Session;

import java.util.List;

public interface ISessionService {
    public List<SessionDto> getAllSessions();
    public SessionDto getSessionById(Long id);
    public SessionDto saveSession(Session session);
    public void deleteSession(Long id);
    public SessionDto updateSession(Session session);
}
