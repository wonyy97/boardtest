package com.green.boardtest.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService SERVICE;

    @Autowired
    public BoardController(BoardService SERVICE) {
        this.SERVICE = SERVICE;
    }
}
