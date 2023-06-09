package com.green.boardtest.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardMapper MAPPER;

    @Autowired
    public BoardService(BoardMapper MAPPER) {
        this.MAPPER = MAPPER;
    }
}
