package com.example.week4homeworkrest.pojo.dto;

import com.example.week4homeworkrest.pojo.entity.Provider;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class ProviderResponseDTO {
    @JsonProperty("data")
    private List<Provider> providerList;

    @Data
    @AllArgsConstructor
    public static class ProviderDTO {
        private String first_name;
        private String last_name;
        private String middle_name;
        private String dob;

        public ProviderDTO(Provider p) {
            this.first_name = p.getFirst_name();
            this.last_name = p.getLast_name();
            this.middle_name = p.getMiddle_name();
            this.dob = p.getDob();
        }
    }
}
