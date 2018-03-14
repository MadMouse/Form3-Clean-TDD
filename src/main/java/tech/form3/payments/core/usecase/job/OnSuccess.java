package tech.form3.payments.core.usecase.job;

@FunctionalInterface
public interface OnSuccess {

    void auditSuccess();

}
