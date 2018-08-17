package com.example.demo.api;

import com.example.demo.vo.DemoVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/api/demo")
public class DemoRest {


    @GetMapping("")
    public ResponseEntity<DemoVO> get(HttpServletRequest request) {

        DemoVO demoVO = new DemoVO();
        demoVO.setDesc("desc");
        demoVO.setName("name");
        demoVO.setId("id");

        String userId = request.getHeader("x-authenticated-userid");
        demoVO.setOpenId(userId);

        return ResponseEntity.ok(demoVO);

    }
}
