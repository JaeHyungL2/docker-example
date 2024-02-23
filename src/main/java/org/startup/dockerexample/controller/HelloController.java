package org.startup.dockerexample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//먼저 레스트컨트롤러 추가
@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String home() {
        //스트링값으로리턴.

        return "zhello jh";
                //로컬호스트8080으로 요청시 출력되는거 알지?
    }
    //간단하게 헬로 도커월드 출력하는걸 만들어보자.
}
