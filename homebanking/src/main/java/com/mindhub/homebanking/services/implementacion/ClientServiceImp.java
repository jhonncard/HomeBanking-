/*
 * @(#) $file.filename
 *
 * Copyright (c) TSHG Consulting  (USA). All rights reserved.
 *
 * All rights to this product are owned by  TSHG consulting  Llc and may only be used under the terms  of the associated license document. you may Not copy, modyfy, sublicense or distributive this sourse file or portions of it unless previously authorized in writing by  TSHG Consultin.
 * In any event, this notice and above copyright must always be included verbatin with this file.
 *
 *
 */
package com.mindhub.homebanking.services.implementacion;

import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.repositories.ClientRepository;
import com.mindhub.homebanking.services.ClientService;


import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jhonny Cardona
 * @Version 1.0.0 of 15-04-2024
 */
public class ClientServiceImp implements ClientService {


    private final ClientRepository clientRepository;

    public ClientServiceImp(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     *
     * @return List<ClientDto>
     */
    @Override
    public List<ClientDTO> findAll() {
        return clientRepository.findAll()
                .stream()
                .map(ClientDTO::new)
                .collect(Collectors.toList());
    }

    /**
     * @name findByID
     * este metedo devuelve un cliente segun su id
     * @param id Id de client
     * @return ClientDto
     */
    @Override
    public ClientDTO findById(long id) {
        return clientRepository.findById(id)
                .map(ClientDTO::new)
                .orElse(null);
    }
}
