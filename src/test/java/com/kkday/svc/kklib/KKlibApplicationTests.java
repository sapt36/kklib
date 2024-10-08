package com.kkday.svc.kklib;

import com.kkday.sdk.annotation.EnableKKdaySdkTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(profiles = "test")
@SpringBootTest(classes = KKlibApplication.class)
@EnableKKdaySdkTest //加這些annotation讓他變成測試環境
class KKlibApplicationTests {

    @Test
    void contextLoads() {
    }
}
