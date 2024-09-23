package api.challenge.model.entity;

import api.challenge.model.enums.PaymentMethod;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
@Data
@Document(collection = "transactions")
public class Transaction {

    @MongoId
    private String id;

    private UUID merchantId;

    private BigDecimal amount;
    private String description;
    private PaymentMethod paymentMethod;
    private String cardNumber;
    private String cardHolderName;
    private String cardExpiryDate;
    private String cvv;
    private LocalDateTime createdAt;
}
