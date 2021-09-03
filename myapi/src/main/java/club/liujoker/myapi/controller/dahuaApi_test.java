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
     * post请求，能够成功发起post请求，且请求报文为JSON格式的请求
     * @param url url地址
     * @param jsonParam 参数,可以为JSONObect格式通过.toJSONString()转化而来
     * @return
     */
    public static String httpPost(String url,String jsonParam){
        //post请求
        HttpClient httpClient = new DefaultHttpClient();
        httpClient = wrapClient(url);
        HttpPost method = new HttpPost(url);
        String str = "";
        try {
            if (null != jsonParam) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam, "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                try {
                    /**读取服务器返回过来的json字符串数据**/
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
    public String dahuaapi_zijin(HttpServletResponse response, @RequestBody Data_dh data_dh){
        JSONObject data_dhs = new JSONObject();
        data_dhs.put("data",data_dh.getData());

        String res = null;
        String url = "https://fssctest.dahuahome.com:9081/dfssc/dhfssc/syncEASForm/queryfundproj";
        res = httpPost(url, data_dhs.toJSONString());//返回值给到下一块用于处理



        return res;
    }

}
