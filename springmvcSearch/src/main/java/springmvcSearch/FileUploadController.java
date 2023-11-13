package springmvcSearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(path = "/fileform")
	public String showUploadForm() {
		
		String str=null;
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		
		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) {

		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getFileItem());

		byte[] data = file.getBytes();
		// we have to save this file to server
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resourses"
				+ File.separator + "image" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.flush();
			fos.close();
			System.out.println("file uploaded");
			model.addAttribute("msg", "uploaded successfully");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("uploading error");
			model.addAttribute("msg", "uploading problem");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "filesuccess";
	}

}
