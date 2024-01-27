package com.agnieszka.mucha.myproject3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * implementation PLUS package - price with VAT
 */
@Service
@ConfigurationProperties(prefix = "shop-setup-plus")
@Profile("PLUS")
public class PlusService extends ShopService {
    private int VAT;

    /**
     * @param originalPrice
     * @return price increase by VAT
     */
    @Override
    public int priceChange(int originalPrice) {
        originalPrice += originalPrice * VAT / 100;
        return originalPrice;
    }

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

}
