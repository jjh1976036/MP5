package mp.infra.dto;

import lombok.Data;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class DeleteReq {
    private UUID id;
    @JsonProperty("author_id")
    private UUID authorId;
}
