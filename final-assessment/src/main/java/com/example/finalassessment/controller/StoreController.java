package com.example.finalassessment.controller;

import com.example.finalassessment.dto.StoreDTO;
import com.example.finalassessment.model.Store;
import com.example.finalassessment.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@Slf4j
public class StoreController {

    @Autowired
    StoreService storeService;

    @PostMapping("/add/{merchantId}")
    public StoreDTO addStoreToMerchant(@PathVariable Long merchantId, @RequestBody StoreDTO request) {
        final Store store = storeService.mapToEntity(request);
        final Store result = storeService.addStore(merchantId, store);
        return storeService.mapToDTO(result);
    }
}

