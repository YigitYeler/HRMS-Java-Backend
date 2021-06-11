package kodlamaio.hrms.core.adapters;

import java.io.IOException;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.abstracts.CloudinaryService;
import kodlamaio.hrms.core.configs.CloudinaryConfig;

@Service
public class CloudinaryAdapter implements CloudinaryService{

	@Override
	public Map<?, ?> imgSave(MultipartFile myFile) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CloudinaryConfig.class);
		Cloudinary cloudinary = ctx.getBean(Cloudinary.class);
		try {
			Map<?, ?> uploadResult = cloudinary.uploader().upload(myFile.getBytes(), ObjectUtils.emptyMap());
			System.out.println(uploadResult.get("url"));
			return uploadResult;
		} catch (IOException e) {
			System.out.println("Hataaaaa");
			e.printStackTrace();
		}
		
		System.out.println(cloudinary.config.apiKey);
		
		return null;
	}

}
