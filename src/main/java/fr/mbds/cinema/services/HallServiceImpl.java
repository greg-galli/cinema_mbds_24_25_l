package fr.mbds.cinema.services;

import fr.mbds.cinema.dtos.HallDto;
import fr.mbds.cinema.entitites.Hall;
import fr.mbds.cinema.mappers.HallMapper;
import fr.mbds.cinema.repositories.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallServiceImpl implements IHallService {

    private final HallRepository hallRepository;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }

    @Override
    public List<HallDto> getAllHalls() {
        return HallMapper.toDtos(hallRepository.findAll());
    }

    @Override
    public HallDto getHallById(Long id) {
        return HallMapper.toDto(hallRepository.findById(id).orElse(null));
    }

    @Override
    public HallDto saveHall(Hall hall) {
        return HallMapper.toDto(hallRepository.save(hall));
    }

    @Override
    public void deleteHall(Long id) {
        hallRepository.deleteById(id);
    }

    @Override
    public HallDto updateHall(Hall hall) {
        return HallMapper.toDto(hallRepository.save(hall));
    }
}
