package com.agnieszka.mucha.myproject3;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * implementation START package - price without modification
 */
@Service
@Profile("START")
public class StartService extends ShopService {
}
