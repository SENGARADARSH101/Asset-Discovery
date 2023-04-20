package com.serviceops.assetdiscovery.utils.mapper;

import com.serviceops.assetdiscovery.entity.Monitor;
import com.serviceops.assetdiscovery.entity.base.SingleBase;
import com.serviceops.assetdiscovery.rest.MonitorRest;
import com.serviceops.assetdiscovery.utils.mapper.base.AssetBaseOps;
import com.serviceops.assetdiscovery.utils.mapper.base.SingleBaseOps;

public class MonitorOps extends SingleBaseOps<Monitor,MonitorRest> {

    private final MonitorRest monitorRest;
    private final Monitor monitor;

    public MonitorOps(Monitor monitor, MonitorRest monitorRest) {
        super(monitor, monitorRest);
        this.monitor = monitor;
        this.monitorRest = monitorRest;
    }

    public MonitorRest entityToRest() {
        super.entityToRest(monitor);
        monitorRest.setRefId(monitor.getRefId());
        monitorRest.setManufacturer(monitor.getManufacturer());
        monitorRest.setDescription(monitor.getDescription());
        monitorRest.setScreenWidth(monitor.getScreenWidth());
        monitorRest.setScreenHeight(monitor.getScreenHeight());
        return monitorRest;
    }

    public Monitor restToEntity() {
        super.restToEntity(monitorRest);
        monitor.setRefId(monitorRest.getRefId());
        monitorRest.setManufacturer(monitor.getManufacturer());
        monitor.setDescription(monitorRest.getDescription());
        monitor.setScreenWidth(monitorRest.getScreenWidth());
        monitor.setScreenHeight(monitorRest.getScreenHeight());
        return monitor;
    }
}
