package com.green.boardtest.cmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class CmtController {

    private final CmtService SERVICE;

    @Autowired
    public CmtController(CmtService SERVICE) {
        this.SERVICE = SERVICE;
    }
}
