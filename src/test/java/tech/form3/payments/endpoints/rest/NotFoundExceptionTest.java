package tech.form3.payments.endpoints.rest;


import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import tech.form3.payments.endpoints.NotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

public class NotFoundExceptionTest {

    @Test
    public void representsHttp404() throws Exception {
        ResponseStatus responseStatus = NotFoundException.class.getAnnotation(ResponseStatus.class);
        assertThat(responseStatus.value()).isEqualTo(HttpStatus.NOT_FOUND);
    }

}