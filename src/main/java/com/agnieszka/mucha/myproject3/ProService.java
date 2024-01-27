package com.agnieszka.mucha.myproject3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * implementation PRO package - price with VAT and discount
 */
@Service
@ConfigurationProperties(prefix = "shop-setup-pro")
@Profile("PRO")
public class ProService extends ShopService {
    private int VAT;
    private int discount;

    /**
     * @param originalPrice
     * @return price increase by VAT and decrease by discount
     */
    @Override
    public int priceChange(int originalPrice) {
        originalPrice += originalPrice * VAT / 100;
        originalPrice -= originalPrice * discount / 100;
        return originalPrice;
    }


    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
