package api.challenge.model.entity;

import api.challenge.model.enums.PaymentStatus;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document(collection = "statements")
public class Statement {

    @MongoId
    private String id;
    private String transactionId;
    private BigDecimal finalAmount;
    private PaymentStatus status;
    private LocalDateTime paymentDate;

}
