package ro.ima.mc.api.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class McApi {

	private static final Logger LOG = LoggerFactory.getLogger(McApi.class);

	@GetMapping
	public ResponseEntity<String> get() {
		LOG.info("hi");
		return ResponseEntity.ok("MC!");
	}
}
