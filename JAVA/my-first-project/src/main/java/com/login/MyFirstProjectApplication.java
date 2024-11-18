package com.login;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MyFirstProjectApplication {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyFirstProjectApplication.class);

//	@Controller
//	public class HomeController {
//		@ResponseBody
//		@RequestMapping ("/index")
//		public String index() {
//			return "index.html";
//		}
//	}


	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
//		LOGGER.info("An INFO Message"); //SOP
//		LOGGER.warn("A WARN Message");
//		LOGGER.error("An ERROR Message");
//		LOGGER.debug("A DEBUG Message");
//		LOGGER.trace("A TRACE Message");
//		LOGGER.error("a FATAL Message");

	}

}
