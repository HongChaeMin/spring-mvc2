package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {

    private String nameStore;

    public void logic(String name) {
        log.info("저장 name : {} -> nameStore : {}", name, nameStore);
        nameStore = name;
        sleep(1000);
        log.info("조회 nameStore : {}", nameStore);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}