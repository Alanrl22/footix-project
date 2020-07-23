package com.wildcodeschool.footix.repository;

import com.wildcodeschool.footix.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

 //   @Query("SELECT player.* FROM player p WHERE (p.lastName= :lastName OR p.firstName= :firstName) ORDER BY p.lastName asc, p.firstName asc)
  //  List<Player> findByLastNameContainingOrFirstNameContaining(@Param("lastName") String lastName , @Param("firstName") String firstName);
}
