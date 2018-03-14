package tech.form3.payments.core.repository;

import tech.form3.payments.core.model.Payment;

import java.util.List;

public interface PaymentRepository {
    /*
 * Insert new payment resource.
 */
    void insert(Payment paymentEntity);

    /*
    * Update payment resource.
    */
    void update(Payment paymentEntity);

    /*
    * Get a specific payment resources by id.
    */
    Payment getPaymentById(String id);

    /*
    * fetch a list of payment resources.
    */
    List<Payment> getAllPayments(Integer page, Integer limit, String sort, String selection, String eTag);

    /*
    * delete an existing payment resource by id.
    */
    void delete(String id);
}
