package org.example.models.repositories;

import org.example.models.entities.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPartnerRepository extends JpaRepository<Partner, Long> {
}
