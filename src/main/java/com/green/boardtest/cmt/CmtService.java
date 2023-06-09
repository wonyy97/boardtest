package com.green.boardtest.cmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmtService {
    private final CmtMapper MAPPER;

    @Autowired
    public CmtService(CmtMapper MAPPER) {
        this.MAPPER = MAPPER;
    }
}
