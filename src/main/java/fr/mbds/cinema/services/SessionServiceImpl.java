package fr.mbds.cinema.services;

import fr.mbds.cinema.dtos.SessionDto;
import fr.mbds.cinema.entitites.Session;
import fr.mbds.cinema.mappers.SessionMapper;
import fr.mbds.cinema.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService {

    private SessionRepository sessionRepository;

    @Autowired
    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public List<SessionDto> getAllSessions() {
        return SessionMapper.toDtos(sessionRepository.findAll());
    }

    @Override
    public SessionDto getSessionById(Long id) {
        return SessionMapper.toDto(sessionRepository.findById(id).orElse(null));
    }

    @Override
    public SessionDto saveSession(Session session) {
        return SessionMapper.toDto(sessionRepository.save(session));
    }

    @Override
    public void deleteSession(Long id) {
        sessionRepository.deleteById(id);
    }

    @Override
    public SessionDto updateSession(Session session) {
        return SessionMapper.toDto(sessionRepository.save(session));
    }
}
