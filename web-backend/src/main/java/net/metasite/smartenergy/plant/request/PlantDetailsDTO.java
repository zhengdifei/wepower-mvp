package net.metasite.smartenergy.plant.request;

import java.math.BigDecimal;
import java.util.Date;

public class PlantDetailsDTO {

    public enum Type {
        SOLAR, WIND, HYDRO
    }

    private String name;
    private String walletId;
    private String areaCode;
    private BigDecimal capacity;
    private Type type;

    private BigDecimal locationLatitude;
    private BigDecimal locationLongtitude;

    private Date produceFrom;
    private Date produceTo;

    public PlantDetailsDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setCapacity(BigDecimal capacity) {
        this.capacity = capacity;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setLocationLatitude(BigDecimal locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public void setLocationLongtitude(BigDecimal locationLongtitude) {
        this.locationLongtitude = locationLongtitude;
    }

    public void setProduceFrom(Date produceFrom) {
        this.produceFrom = produceFrom;
    }

    public void setProduceTo(Date produceTo) {
        this.produceTo = produceTo;
    }

    public String getName() {
        return name;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public BigDecimal getCapacity() {
        return capacity;
    }

    public Type getType() {
        return type;
    }

    public BigDecimal getLocationLatitude() {
        return locationLatitude;
    }

    public BigDecimal getLocationLongtitude() {
        return locationLongtitude;
    }

    public Date getProduceFrom() {
        return produceFrom;
    }

    public Date getProduceTo() {
        return produceTo;
    }
}
