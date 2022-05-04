package com.sm;

import com.rm.Solo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SoloRunner implements ApplicationRunner {

    @Autowired
    Solo solo; // 이 프로젝트에서는 Solo라는 것을 Bean으로 등록하지 않았지만 주입 받을 수 있다.

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(solo);
    }
}
