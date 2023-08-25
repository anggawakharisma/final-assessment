package com.example.finalassessment.service;

import com.example.finalassessment.dto.StoreDTO;
import com.example.finalassessment.model.Merchant;
import com.example.finalassessment.model.Store;
import com.example.finalassessment.repository.StoreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    MerchantService merchantService;

    @Autowired
    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    StoreRepository storeRepository;
    
    @Override
    public Store addStore(Long merchantId, Store store) {
        Merchant merchant = merchantService.findById(merchantId);
        if (merchant != null) {
            store = storeRepository.save(store);
            if (merchant.getStores() != null) {
                List<Store> stores = merchant.getStores();
                stores.add(store);
                merchant.setStores(stores);
            } else {
                merchant.setStores(Collections.singletonList(store));
            }
            merchantService.create(merchant);
            return store;
        }
        return null;
    }

    @Override
    public Store mapToEntity(StoreDTO storeDTO) {
        return mapper.convertValue(storeDTO, Store.class);
    }

    @Override
    public StoreDTO mapToDTO(Store store) {
        return mapper.convertValue(store, StoreDTO.class);
    }
}
