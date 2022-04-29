package ea.slartibartfast.demo.docker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
public class PaymentVo {

    private Integer paymentId;
    private String cardToken;
    private BigDecimal price;
    private String currency;
}
