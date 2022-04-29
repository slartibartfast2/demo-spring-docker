package ea.slartibartfast.demo.docker.controller;

import ea.slartibartfast.demo.docker.model.PaymentVo;
import ea.slartibartfast.demo.docker.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payment")
public class RestPaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{id}")
    public PaymentVo retrieve(@PathVariable("id") int paymentId) {
        return paymentService.findPayment(paymentId);
    }
}
