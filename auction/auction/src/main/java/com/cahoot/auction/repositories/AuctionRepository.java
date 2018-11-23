package com.cahoot.auction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cahoot.auction.models.Auction;

public interface AuctionRepository extends JpaRepository<Auction, Long> {

}
