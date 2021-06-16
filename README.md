# springboot-aws-lambda
* AWS Lambda is a serverless compute service that runs your code in response to events and automatically manages the underlying compute resources.
* Virtual __function__ - no server to manage.
* __Scaling is automated__

### How to run spring boot application on aws?
* Create Lambda function on aws account.
* Add request handler class(Package name. handler class name)
* Add environment variable (spring function name- product and findproductbyCategories)
* Upload .jar file
* Test

# spring boot lambda function using API Gateway trigger
* In handler class add APIGatewayProxyRequestEvent and response object change List<product> 

public class ProductHandler extends SpringBootRequestHandler< __APIGatewayProxyRequestEvent, List<Product>>__ {
}
  
* same change to function
  
  public Function<__APIGatewayProxyRequestEvent,List<Product>__> findproductbyCategories()
  
 * add query string parameter
 * In aws lambda function add trigger API Gateway
  

