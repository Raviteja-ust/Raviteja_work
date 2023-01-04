package com.ust.mappings;

import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.mappings.entity.Apps;
import com.ust.mappings.entity.Crop;
import com.ust.mappings.entity.Former;
import com.ust.mappings.entity.Mobile;
import com.ust.mappings.repositary.AppsRepositary;
import com.ust.mappings.repositary.CropRepositary;
import com.ust.mappings.repositary.FormerRepositary;
import com.ust.mappings.repositary.MobileRepositary;

@SpringBootApplication
public class JpaOneToManyMappingsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaOneToManyMappingsApplication.class, args);
		
		/*
		 * MobileRepositary mobileRepositary = context.getBean(MobileRepositary.class);
		 * AppsRepositary appRepositary = context.getBean(AppsRepositary.class);
		 */
		
		  CropRepositary cropRepositary = context.getBean(CropRepositary.class);
		  FormerRepositary formerRepositary = context.getBean(FormerRepositary.class);
		  
		  Former former=new Former("Raviteja",5,"Rice"); formerRepositary.save(former);
		  
		  cropRepositary.save(new Crop("Rice","5",former)); cropRepositary.save(new
		  Crop("Banana","3",former)); cropRepositary.save(new
		  Crop("Wheet","5",former));
		 
		
		 List<Former> id = formerRepositary.findByFormerId(former.getFormerId());
		  for(Former f: id) {
		   System.out.println("========== Former Details========");
		   System.out.println(f.getFormerId());
		   System.out.println(f.getFormerName());
		   System.out.println(f.getTypeOfCrop());
		   System.out.println(f.getNoOfAcres());
		  }
		  
		  
		
			/*
			 * Mobile m=new Mobile("Samsung", "M13"); mobileRepositary.save(m);
			 * 
			 * appRepositary.save( new Apps( "FitPro", 12, m)); appRepositary.save( new
			 * Apps( "IRCTC", 13, m)); appRepositary.save( new Apps( "Whatsapp", 30, m));
			 * System.out.println("Id -->"+m.getId());
			 * 
			 * Set<Apps> findById = appRepositary.findById(m.getId()); for(Apps m1:findById)
			 * { System.out.println(m1.getId());
			 * System.out.println(m1.getMobile().getMobileBrand());
			 * System.out.println(m1.getMobile().getMobileName());
			 * System.out.println(m1.getAppSize()); System.out.println(m1.getAppName()); }
			 */
		
		
		
		
		
	}

}
