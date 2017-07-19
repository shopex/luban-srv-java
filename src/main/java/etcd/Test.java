package etcd;

//import java.io.IOException;
//import java.net.URI;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeoutException;
//
//import mousio.etcd4j.EtcdClient;
//import mousio.etcd4j.responses.EtcdAuthenticationException;
//import mousio.etcd4j.responses.EtcdException;


public class Test {
	public static void main(String[] args) {
		try {
			EtcdUtil c = new EtcdUtil("http://192.168.199.205:2379");
			c.puttmp("/luban/nodes/javamember/192.168.199.241:8088", "ok");
//			c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
