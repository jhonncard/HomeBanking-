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
package com.mindhub.homebanking.services;

import com.mindhub.homebanking.dtos.ClientDTO;

import java.util.List;

/**
 * CliientServices
 *
 * @author Jhonny Cardona
 * @version 1.0.0, 15/04/2024 : 17:12
 */
public interface ClientService {

    List<ClientDTO> findAll();

     ClientDTO findById(long id);
}
