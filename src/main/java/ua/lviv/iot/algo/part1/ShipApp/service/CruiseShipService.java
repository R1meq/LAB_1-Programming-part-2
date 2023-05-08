package ua.lviv.iot.algo.part1.ShipApp.service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.ShipApp.models.CruiseShip;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CruiseShipService {

    private final Map<Integer, CruiseShip> shipHashMap = new HashMap<>();

    private final AtomicInteger idCounter = new AtomicInteger();

    public List<CruiseShip> findAllShips() {
        return new LinkedList<CruiseShip>(shipHashMap.values());
    }

    public CruiseShip findById(final Integer shipId) {
        return shipHashMap.get(shipId);
    }

    public CruiseShip createShip(final CruiseShip cruiseShip) {
        cruiseShip.setId(idCounter.incrementAndGet());
        shipHashMap.put(cruiseShip.getId(), cruiseShip);
        return cruiseShip;
    }

    public CruiseShip update(final Integer cruiseId,
                             final CruiseShip updateShip) {
        updateShip.setId(cruiseId);
        shipHashMap.put(cruiseId,updateShip);
        return updateShip;
    }

    public ResponseEntity<CruiseShip> deleteShipById(final Integer shipId) {
        HttpStatus status = shipHashMap.
                remove(shipId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
}
