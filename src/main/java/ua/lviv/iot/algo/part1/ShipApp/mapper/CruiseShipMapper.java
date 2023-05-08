package ua.lviv.iot.algo.part1.ShipApp.mapper;

import org.springframework.stereotype.Component;
import ua.lviv.iot.algo.part1.ShipApp.dto.CruiseShipDto;
import ua.lviv.iot.algo.part1.ShipApp.models.CruiseShip;

@Component
public class CruiseShipMapper {
    public CruiseShipDto mapToCruiseShipDto(final CruiseShip cruiseShip) {
        return CruiseShipDto.builder()
                .id(cruiseShip.getId())
                .idOfShip(cruiseShip.getIdOfShip())
                .name(cruiseShip.getName())
                .captain(cruiseShip.getCaptain())
                .currentPort(cruiseShip.getCurrentPort())
                .maxSpeed(cruiseShip.getMaxSpeed())
                .maxCapacity(cruiseShip.getMaxCapacity())
                .currentLoad(cruiseShip.getCurrentLoad())
                .currentSpeed(cruiseShip.getCurrentSpeed())
                .crewCount(cruiseShip.getCrewCount())
                .supportStaff(cruiseShip.getSupportStaff())
                .passengersCount(cruiseShip.getPassengersCount())
                .build();
    }
}
