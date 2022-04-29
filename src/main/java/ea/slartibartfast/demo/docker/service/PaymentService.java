package ea.slartibartfast.demo.docker.service;

import ea.slartibartfast.demo.docker.exception.NotFoundException;
import ea.slartibartfast.demo.docker.model.PaymentVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@RequiredArgsConstructor
@Service
public class PaymentService {

    public PaymentVo findPayment(int paymentId) {
        log.debug("payment found for paymentId={}", paymentId);

        if (paymentId == 13) throw new NotFoundException("No payment found for paymentId: " + paymentId);

        return PaymentVo.builder()
                        .paymentId(paymentId)
                        .cardToken(paymentId + "-token")
                        .currency("TRY")
                        .price(BigDecimal.TEN)
                        .build();
    }
}
