package org.example.models.services;

import org.example.models.entities.Partner;

import java.util.List;
import java.util.Optional;

public interface IPartnerService {

    public void create (Partner partner);
    public List<Partner> readAll();
    public Optional<Partner> readOne(Long idPartner);
    public void update(Partner partner);
    public void delete (Long idPartner);
}
