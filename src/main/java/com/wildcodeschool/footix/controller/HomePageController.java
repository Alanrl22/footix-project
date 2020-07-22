package com.wildcodeschool.footix.controller;

import com.wildcodeschool.footix.repository.ClubRepository;
import com.wildcodeschool.footix.repository.PlayerRepository;
import com.wildcodeschool.footix.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomePageController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private RoleRepository roleRepository;
}
