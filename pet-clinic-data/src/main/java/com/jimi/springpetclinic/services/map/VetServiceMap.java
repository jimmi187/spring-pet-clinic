package com.jimi.springpetclinic.services.map;

import com.jimi.springpetclinic.model.Speciality;
import com.jimi.springpetclinic.model.Vet;
import com.jimi.springpetclinic.services.SpecialityService;
import com.jimi.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach( speciality -> {
                Speciality savedSpec = specialityService.save(speciality);
                speciality.setId(savedSpec.getId());
            });
        }
        return super.save( object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

}
