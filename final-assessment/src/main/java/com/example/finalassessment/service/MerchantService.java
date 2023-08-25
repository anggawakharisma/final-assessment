package com.example.finalassessment.service;

import com.example.finalassessment.dto.MerchantDTO;
import com.example.finalassessment.model.Merchant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MerchantService {

    Merchant create(Merchant merchant);
    Merchant update(Long id, Merchant merchant);
    Boolean delete(Long id);
    List<Merchant> findAll();
    Page<Merchant> findAll(Pageable pageable);
    Merchant findById(Long id);

    MerchantDTO mapToDto(Merchant merchant);
    Merchant mapToEntity(MerchantDTO merchantDTO);
}
