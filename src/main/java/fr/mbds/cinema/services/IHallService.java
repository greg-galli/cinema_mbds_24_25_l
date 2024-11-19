package fr.mbds.cinema.services;

import fr.mbds.cinema.dtos.HallDto;
import fr.mbds.cinema.entitites.Hall;

import java.util.List;

public interface IHallService {
    public List<HallDto> getAllHalls();
    public HallDto getHallById(Long id);
    public HallDto saveHall(Hall hall);
    public void deleteHall(Long id);
    public HallDto updateHall(Hall hall);
}
