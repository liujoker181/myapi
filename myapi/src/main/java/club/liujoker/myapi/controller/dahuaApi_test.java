package club.liujoker.myapi.controller;

import club.liujoker.myapi.domain.Data_dh;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@RestController
public class dahuaApi_test {

     private static String data = "";

    public static HttpClient wrapClient(String host) {
        HttpClient httpClient = new DefaultHttpClient();
        if (host.startsWith("https")){
            return sslClient(httpClient);
        }
        return httpClient;
    }

    private static HttpClient sslClient(HttpClient httpClient){
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new X509TrustManager(){

                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                }

                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                }

                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx,SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            SchemeRegistry registry = new SchemeRegistry();
            registry.register(new Scheme("https",443,ssf));
            ThreadSafeClientConnManager mgr = new ThreadSafeClientConnManager(registry);
            return new DefaultHttpClient(mgr, httpClient.getParams());

        } catch (Exception e) {
            return null;
            // TODO: handle exception
        }
    }

    /**
     * post???????????????????????????post???????????????????????????JSON???????????????
     * @param url url??????
     * @param jsonParam ??????,?????????JSONObect????????????.toJSONString()????????????
     * @return
     */
    public static String httpPost(String url,String jsonParam){
        //post??????
        HttpClient httpClient = new DefaultHttpClient();
        httpClient = wrapClient(url);
        HttpPost method = new HttpPost(url);
        String str = "";
        try {
            if (null != jsonParam) {
                //????????????????????????
                StringEntity entity = new StringEntity(jsonParam, "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**????????????????????????????????????**/
            if (result.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                try {
                    /**??????????????????????????????json???????????????**/
                    str = EntityUtils.toString(result.getEntity());
                    System.out.println("str");

                } catch (Exception e) {
                    return null;
                }
            }
            else
            {
                return null;
            }
        } catch (Exception e) {
            return e.toString();
        }
        return str;
    }

    @RequestMapping(value = "dahua",method = RequestMethod.POST)
    public String dahuaapi_zijin(HttpServletResponse response){

        String res;
        res = "{\n" +
                "    \"data\": {\n" +
                "        \"body\": [\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-08\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-08\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-04\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-05\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-06\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-07\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06-05\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-06\",\n" +
                "                \"parentname\": \"????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02-01\",\n" +
                "                \"name\": \"10?????????\",\n" +
                "                \"parentcode\": \"TP-SR-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02-02\",\n" +
                "                \"name\": \"?????????\",\n" +
                "                \"parentcode\": \"TP-SR-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02-04\",\n" +
                "                \"name\": \"?????????-??????\",\n" +
                "                \"parentcode\": \"TP-SR-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-SR-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-07\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-SR-05\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-04\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-SR-05\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-02\",\n" +
                "                \"name\": \"?????????\",\n" +
                "                \"parentcode\": \"TP-SR-05\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-05\",\n" +
                "                \"name\": \"?????????/?????????\",\n" +
                "                \"parentcode\": \"TP-SR-05\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-06\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-SR-05\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-08\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06-06\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-06\",\n" +
                "                \"parentname\": \"????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-07-01\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-07\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-07-02\",\n" +
                "                \"name\": \"?????????\",\n" +
                "                \"parentcode\": \"TP-ZC-07\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-07-03\",\n" +
                "                \"name\": \"?????????\",\n" +
                "                \"parentcode\": \"TP-ZC-07\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-07-04\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-07\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-03\",\n" +
                "                \"name\": \"?????????\",\n" +
                "                \"parentcode\": \"TP-SR-05\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-02-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-02-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-02-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-03\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-CZ\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-JY\",\n" +
                "                \"name\": \"???????????????????????????????????????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-QC\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-QC-01\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-QC\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-QC-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-QC\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-QM\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-01\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-SR\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-01-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-SR-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-SR\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-03\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-SR\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-04\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-SR\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-SR\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-TZ\",\n" +
                "                \"name\": \"???????????????????????????????????????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-TZ-01\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-TZ\",\n" +
                "                \"parentname\": \"???????????????????????????????????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-TZ-02\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-TZ\",\n" +
                "                \"parentname\": \"???????????????????????????????????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01\",\n" +
                "                \"name\": \"??????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-01\",\n" +
                "                \"name\": \"??????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-02\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02-03\",\n" +
                "                \"name\": \"?????????-?????????\",\n" +
                "                \"parentcode\": \"TP-SR-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-02-06\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-SR-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-03\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-04\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-05\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-06\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-01-07\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-03\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-04\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01\",\n" +
                "                \"parentname\": \"????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-02\",\n" +
                "                \"name\": \"?????????????????????????????????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-02-01\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-02\",\n" +
                "                \"parentname\": \"?????????????????????????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-02-02\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-02\",\n" +
                "                \"parentname\": \"?????????????????????????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06\",\n" +
                "                \"name\": \"????????????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06-01\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-06\",\n" +
                "                \"parentname\": \"????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06-02\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-06\",\n" +
                "                \"parentname\": \"????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06-03\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-06\",\n" +
                "                \"parentname\": \"????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-06-04\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-06\",\n" +
                "                \"parentname\": \"????????????????????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-07\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-01-02\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-SR-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-05-01\",\n" +
                "                \"name\": \"???????????????\",\n" +
                "                \"parentcode\": \"TP-SR-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-SR-06\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-SR\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-01\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-03-01\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01-03\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-03-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01-03\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01\",\n" +
                "                \"name\": \"??????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-02\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01\",\n" +
                "                \"parentname\": \"??????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-02-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-02\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-02-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-02\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-02-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-02\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"\",\n" +
                "                \"parentname\": \"\",\n" +
                "                \"intlevel\": 1,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 2,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-01\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-01-01\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-01-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-02\",\n" +
                "                \"name\": \"??????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-02-01\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-02-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-01-03\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-01\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-02-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-02\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-02-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-02\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02\",\n" +
                "                \"name\": \"?????????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-01\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02\",\n" +
                "                \"parentname\": \"?????????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-01-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-01-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-01-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-01-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-01-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-02\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02\",\n" +
                "                \"parentname\": \"?????????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-02-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-02-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-02-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-02-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-02-02-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-02-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03\",\n" +
                "                \"name\": \"?????????????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 3,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-01\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03\",\n" +
                "                \"parentname\": \"?????????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-01-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-01-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-01\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-01-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-01\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-01-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-01\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-01-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-01\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-01-01-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-01-01\",\n" +
                "                \"parentname\": \"?????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-01-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-01-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-01-04\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-01-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-01\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-02\",\n" +
                "                \"name\": \"????????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03\",\n" +
                "                \"parentname\": \"?????????????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 0,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-02-01\",\n" +
                "                \"name\": \"?????????????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-CZ-02-03-02-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-CZ-02-03-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 5,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-04\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-05\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-06\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-02-07\",\n" +
                "                \"name\": \"???????????????????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-02\",\n" +
                "                \"parentname\": \"????????????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-01\",\n" +
                "                \"name\": \"??????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-02\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"code\": \"TP-ZC-01-05-03\",\n" +
                "                \"name\": \"????????????\",\n" +
                "                \"parentcode\": \"TP-ZC-01-05\",\n" +
                "                \"parentname\": \"??????????????????\",\n" +
                "                \"intlevel\": 4,\n" +
                "                \"isleaf\": 1,\n" +
                "                \"status\": 1,\n" +
                "                \"reference1\": \"\",\n" +
                "                \"reference2\": \"\",\n" +
                "                \"reference3\": \"\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"head\": {\n" +
                "            \"sucflag\": \"Y\",\n" +
                "            \"totalnum\": \"131\",\n" +
                "            \"errmsg\": \"\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        return res;
    }

}
