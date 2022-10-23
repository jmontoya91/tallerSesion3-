package helper;

public class ApiOwaspZap {

    public static final String START_SCANNER=GetProperties.getInstance().getOwasp()+"/JSON/ascan/action/scan/?url=%s";
    public static final String MONITORING_STATUS=GetProperties.getInstance().getOwasp()+"/JSON/ascan/view/status/?scanId=%s";
    public static final String GET_ALERTS=GetProperties.getInstance().getOwasp()+"http://127.0.0.1:8888/HTML/core/view/alerts/?baseurl=%s";
    public static final String GET_REPORT=GetProperties.getInstance().getOwasp()+"/OTHER/core/other/htmlreport/?";
    public static final String GET_CURRENT_ATACK=GetProperties.getInstance().getOwasp()+"/HTML/ascan/view/scanProgress/?scanId=%s";

}
