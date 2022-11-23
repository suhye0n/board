package com.board.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    
    @GetMapping("/board")
    public String boardWriteForm() {
        return "boardwrite.html";
    }
}
