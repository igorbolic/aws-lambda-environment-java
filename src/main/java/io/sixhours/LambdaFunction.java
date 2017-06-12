package io.sixhours;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.sixhours.service.DefaultService;
import io.sixhours.service.Service;

/**
 * AWS Lambda function.
 *
 * @author Igor Bolic
 */
public class LambdaFunction implements RequestHandler<Void, String> {

    private final Service service = DefaultService.instance;

    @Override
    public String handleRequest(Void input, Context context) {

        return service.fullName();
    }
}
