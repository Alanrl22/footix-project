package com.wildcodeschool.footix.controller;

import com.wildcodeschool.footix.entity.Club;
import com.wildcodeschool.footix.entity.Player;
import com.wildcodeschool.footix.repository.ClubRepository;
import com.wildcodeschool.footix.repository.PlayerRepository;
import com.wildcodeschool.footix.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClubCreationController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/club-creation")
    public String getClubCreation(Model out) {

        Club club = new Club();
        out.addAttribute("club", club);

        return "club-creation";
    }


    @PostMapping("/club-creation")
    public String postClub(@ModelAttribute Club club) {

        clubRepository.save(club);

        return "redirect:/";
    }
}