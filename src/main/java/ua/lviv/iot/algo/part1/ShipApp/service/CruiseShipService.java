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
        CruiseShip cruiseShip = shipHashMap.get(cruiseId);
        cruiseShip.setIdOfShip(updateShip.getIdOfShip());
        cruiseShip.setName(updateShip.getName());
        cruiseShip.setCaptain(updateShip.getCaptain());
        cruiseShip.setCurrentPort(updateShip.getCurrentPort());
        cruiseShip.setMaxSpeed(updateShip.getMaxSpeed());
        cruiseShip.setMaxCapacity(updateShip.getMaxCapacity());
        cruiseShip.setCurrentLoad(updateShip.getCurrentLoad());
        cruiseShip.setCurrentSpeed(updateShip.getCurrentSpeed());
        cruiseShip.setCrewCount(updateShip.getCrewCount());
        cruiseShip.setSupportStaff(updateShip.getSupportStaff());
        cruiseShip.setPassengersCount(updateShip.getPassengersCount());
        shipHashMap.put(cruiseId, cruiseShip);
        return updateShip;
    }

    public ResponseEntity<CruiseShip> deleteShipById(final Integer shipId) {
        HttpStatus status = shipHashMap.
                remove(shipId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
}
