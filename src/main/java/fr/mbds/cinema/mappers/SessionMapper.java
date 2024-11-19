package fr.mbds.cinema.mappers;

import fr.mbds.cinema.dtos.SessionDto;
import fr.mbds.cinema.entitites.Session;

import java.util.List;

public class SessionMapper {

    public static SessionDto toDto(Session session) {
        return SessionDto.builder()
                .id(session.getId())
                .movie(session.getMovie())
                .hall(session.getHall())
                .date(session.getDate())
                .build();
    }

    public static Session toEntity(SessionDto sessionDto) {
        return Session.builder()
                .id(sessionDto.getId())
                .movie(sessionDto.getMovie())
                .hall(sessionDto.getHall())
                .date(sessionDto.getDate())
                .build();
    }

    public static List<SessionDto> toDtos(List<Session> sessions) {
        return sessions.stream().map(SessionMapper::toDto).toList();
    }

    public static List<Session> toEntities(List<SessionDto> sessionDtos) {
        return sessionDtos.stream().map(SessionMapper::toEntity).toList();
    }

}
