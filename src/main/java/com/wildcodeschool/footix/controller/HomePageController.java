package com.wildcodeschool.footix.controller;

import com.wildcodeschool.footix.entity.Club;
import com.wildcodeschool.footix.entity.Player;
import com.wildcodeschool.footix.entity.Role;
import com.wildcodeschool.footix.repository.ClubRepository;
import com.wildcodeschool.footix.repository.PlayerRepository;
import com.wildcodeschool.footix.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import java.util.List;


@Controller
public class HomePageController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/home")
    public String getHome(Model model) {



        List<Player> list = playerRepository.findAll();
        model.addAttribute("players", list);

        List<Club> clubs = clubRepository.findAll();
        model.addAttribute("clubs", clubs);

        List<Role> roles = roleRepository.findAll();
        model.addAttribute("roles", roles);

        return "home";
    }


}