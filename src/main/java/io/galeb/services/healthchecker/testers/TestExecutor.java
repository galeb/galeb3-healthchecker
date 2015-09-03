package io.galeb.services.healthchecker.testers;

import java.util.Optional;

import io.galeb.core.logging.Logger;

public interface TestExecutor {

    TestExecutor withUrl(String fullPath);

    TestExecutor withHost(String host);

    TestExecutor withStatusCode(int statusCode);

    TestExecutor withBody(String body);

    public default TestExecutor connectTimeOut(Integer timeout) {
        return this;
    };

    public default TestExecutor followRedirects(Boolean follow) {
        return this;
    };

    TestExecutor setLogger(Optional<Logger>  logger);

    TestExecutor reset();

    boolean check();

}
