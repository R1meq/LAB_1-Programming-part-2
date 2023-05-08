package ua.lviv.iot.algo.part1.ShipApp.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ua.lviv.iot.algo.part1.ShipApp.models.CruiseShip;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Component
public class CruiseShipService {

    private final Map<Integer, CruiseShip> shipHashMap = new HashMap<>();

    private final AtomicInteger idCounter = new AtomicInteger();

    public List<CruiseShip> findAllShips() {
        return new LinkedList<CruiseShip>(shipHashMap.values());
    }

    public CruiseShip findById(final Integer id) {
        return shipHashMap.get(id);
    }

    public CruiseShip createShip(final CruiseShip cruiseShip) {
        cruiseShip.setId(idCounter.incrementAndGet());
        shipHashMap.put(cruiseShip.getId(), cruiseShip);
        return cruiseShip;
    }

    public CruiseShip update(final Integer id, final CruiseShip updateShip) {
        updateShip.setId(id);
        shipHashMap.put(id,updateShip);
        return updateShip;
    }

    public ResponseEntity<CruiseShip> deleteShipById(final Integer id) {
        HttpStatus status = shipHashMap.
                remove(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
}
