package kodlamaio.hrms.core.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudinaryConfig {
	@Bean
	public Cloudinary cloudinary() {
		return new Cloudinary(ObjectUtils.asMap("cloud_name", "dn6pckfso", "api_key", "331547248679693", "api_secret", "3vexCLfwvm0RhcU--djd7eGNDVc"));
	}
}
