package com.socops.web;

import com.socops.data.IcebreakerPrompts;
import com.socops.model.BingoCell;
import com.socops.model.ScavengerItem;
import com.socops.service.BoardAssembler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/** Serves the game page and the board-generation REST endpoints. */
@Controller
public class BingoRestController {

    @GetMapping("/")
    public String serveLobbyPage() {
        return "game";
    }

    @GetMapping("/api/bingo/fresh-board")
    @ResponseBody
    public List<BingoCell> dispenseFreshBoard() {
        return BoardAssembler.assembleNewBoard();
    }

    @GetMapping("/api/scavenger/items")
    @ResponseBody
    public List<ScavengerItem> dispenseScavengerItems() {
        var shuffled = new ArrayList<>(IcebreakerPrompts.ALL_PROMPTS);
        Collections.shuffle(shuffled);
        List<String> chosen = shuffled.subList(0, Math.min(15, shuffled.size()));
        return IntStream.range(0, chosen.size())
                .mapToObj(i -> new ScavengerItem(i, chosen.get(i)))
                .toList();
    }
}
