package com.example.finalassessment.service;

import com.example.finalassessment.dto.StoreDTO;
import com.example.finalassessment.model.Store;

public interface StoreService {

    Store addStore(Long merchantId, Store store);

    Store mapToEntity(StoreDTO storeDTO);
    StoreDTO mapToDTO(Store store);
}
