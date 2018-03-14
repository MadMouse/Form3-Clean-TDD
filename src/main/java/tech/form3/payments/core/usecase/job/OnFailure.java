package tech.form3.payments.core.usecase.job;

@FunctionalInterface
public interface OnFailure {

    void auditFailure();

}
