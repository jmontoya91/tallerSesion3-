package factoryRequest;

public class ResponseInformation {

    private String body;
    private int responseCode;

    public ResponseInformation(){}

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}
