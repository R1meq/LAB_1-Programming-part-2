package ua.lviv.iot.algo.part1.ShipApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.ShipApp.dto.CruiseShipDto;
import ua.lviv.iot.algo.part1.ShipApp.mapper.CruiseShipMapper;
import ua.lviv.iot.algo.part1.ShipApp.models.CruiseShip;
import ua.lviv.iot.algo.part1.ShipApp.service.CruiseShipService;

import java.util.List;

@RequestMapping("/cruiseShip")
@RestController
public class CruiseShipController {

    @Autowired
    private CruiseShipService cruiseShipService;

    @Autowired
    private CruiseShipMapper cruiseShipMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CruiseShipDto> getAll() {
        return cruiseShipService.findAllShips().
                stream().map(cruiseShipMapper::mapToCruiseShipDto).toList();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(final @PathVariable("id") Integer id) {
       if (cruiseShipService.findById(id) != null) {
           return ResponseEntity.ok(cruiseShipMapper.
                   mapToCruiseShipDto(cruiseShipService.findById(id)));
       } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public CruiseShipDto createShip(final @RequestBody CruiseShip entity) {
        CruiseShip cruiseShip = cruiseShipService.createShip(entity);
        return cruiseShipMapper.mapToCruiseShipDto(cruiseShip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(final @PathVariable("id") Integer id,
                                    final @RequestBody CruiseShip entity) {
        if (cruiseShipService.findById(id) != null) {
            return ResponseEntity.
                    ok(cruiseShipMapper.mapToCruiseShipDto
                            (cruiseShipService.update(id, entity)));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<CruiseShip> delete(
            final @PathVariable("id") Integer id) {

        return cruiseShipService.deleteShipById(id);
    }
}


