package factoryRequest;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGET extends Request{
    @Override
    public ResponseInformation send(String url, String body) {
        System.out.println("Request> url: "+url);
        System.out.println("Request> body: "+body);

        Response response = client.target(url)
                                  .request(MediaType.APPLICATION_JSON_TYPE)
                                  .get();
        ResponseInformation res = new ResponseInformation();

        res.setBody(response.readEntity(String.class));
        res.setResponseCode(response.getStatus());

        System.out.println("Response > body: "+res.getBody());
        System.out.println("Response > code: "+res.getResponseCode());
        return res;
    }
}
