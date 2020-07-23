package com.wildcodeschool.footix.controller;

import com.wildcodeschool.footix.entity.Player;
import com.wildcodeschool.footix.repository.ClubRepository;
import com.wildcodeschool.footix.repository.PlayerRepository;
import com.wildcodeschool.footix.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
public class PlayerCreationController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/player-creation")
    public String getPlayerCreation(Model out) {

        Player player = new Player();
        out.addAttribute("player", player);
        out.addAttribute("clubList", clubRepository.findAll());
        out.addAttribute("roleList", roleRepository.findAll());

        return "player-creation";
    }


    @PostMapping("/player-creation")
    public String postPlayer(@ModelAttribute Player player) {

        playerRepository.save(player);
        return "redirect:/";
    }

    @PostMapping("/delete-player")
    public String deletePlayer(@RequestParam Long id) {
        playerRepository.deleteById(id);
        return "redirect:/";
    }

}
