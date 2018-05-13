package example;

import com.amazonaws.services.lambda.runtime.Context; 

public class Hello {

	public static ResponseClass handleRequest(RequestClass request, Context context){
        String greetingString = String.format("Hello %s %s.", request.getFirstName(), request.getLastName());
        return new ResponseClass(greetingString);
	}
	
}