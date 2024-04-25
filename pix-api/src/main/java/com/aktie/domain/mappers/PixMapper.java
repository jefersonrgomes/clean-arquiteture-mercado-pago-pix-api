package com.aktie.domain.mappers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;

public class PixMapper {

    public static PixDTO toDTO(PixBO pixBO) {
        PixDTO dto = new PixDTO();
        dto.setId(pixBO.getId().toString());
        dto.setAmount(pixBO.getAmount());
        dto.setEmail(pixBO.getEmail());
        dto.setDescription(pixBO.getDescription());
        dto.setEmv(pixBO.getEmv());
        dto.setBase64(pixBO.getBase64());
        dto.setExpiration(pixBO.getExpiration());
        return dto;
    }

    public static PixBO toBO(PixDTO pixDTO) {
        return new PixBO(
                pixDTO.getId(),
                pixDTO.getAmount(),
                pixDTO.getEmail(),
                pixDTO.getDescription(),
                pixDTO.getEmv(),
                pixDTO.getBase64(),
                pixDTO.getExpiration()
        );
    }
}
