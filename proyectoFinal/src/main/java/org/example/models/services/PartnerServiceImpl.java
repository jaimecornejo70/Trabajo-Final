package org.example.models.services;

import org.example.models.entities.Partner;
import org.example.models.repositories.IPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PartnerServiceImpl implements IPartnerService{

    @Autowired
    IPartnerRepository partnerRepository;

    @Override
    public void create(Partner partner) {
        partnerRepository.save(partner);
    }

    @Override
    public List<Partner> readAll() { return partnerRepository.findAll(); }

    @Override
    public Optional<Partner> readOne(Long idPartner) {
        return partnerRepository.findById(idPartner);
    }

    @Override
    public void update(Partner partner) {
        partnerRepository.save(partner);
    }

    @Override
    public void delete(Long idPartner) {
        partnerRepository.deleteById(idPartner);
    }
}
