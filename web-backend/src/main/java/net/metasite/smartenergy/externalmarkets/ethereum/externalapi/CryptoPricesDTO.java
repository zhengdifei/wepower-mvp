package net.metasite.smartenergy.externalmarkets.ethereum.externalapi;

import java.math.BigDecimal;

public class CryptoPricesDTO {
    private BigDecimal eur;

    public CryptoPricesDTO() {
    }

    public BigDecimal getEur() {
        return eur;
    }

    public void setEur(BigDecimal eur) {
        this.eur = eur;
    }
}
