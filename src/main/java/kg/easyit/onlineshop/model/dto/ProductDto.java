package kg.easyit.onlineshop.model.dto;

import kg.easyit.onlineshop.model.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {
    String productName;
    BigDecimal price;
    Long unitsInStock;
    LocalDate dateUpdated;
    User user;
}
