package mp.infra.dto;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PurchaseRequest {
    private String userId;
    private String bookId;
    private int point;
}


