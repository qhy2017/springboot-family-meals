package qhy.example.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Slf4j
@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(WebApplication.class, args);
//		String path = WebApplication.class.getClassLoader().getResource("bmpService_local.wsdl").getPath();
//		ClassPathResource classPathResource = new ClassPathResource("bmpService_local.wsdl");
//		InputStream inputStream = classPathResource.getInputStream();
//		String s = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
////		System.out.println("yyyy " + s);
//		URL url1 = classPathResource.getURL();
//		String file = url1.getFile();
//		Object content = url1.getContent();

//		System.out.println("----------------    " + IOUtils.toString((BufferedInputStream)content,StandardCharsets.UTF_8));
	}

}
