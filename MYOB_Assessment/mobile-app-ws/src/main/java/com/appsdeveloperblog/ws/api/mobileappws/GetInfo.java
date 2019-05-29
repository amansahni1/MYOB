	package com.appsdeveloperblog.ws.api.mobileappws;


	import org.springframework.stereotype.Component;
	import org.springframework.boot.context.properties.ConfigurationProperties;
	@Component
	@ConfigurationProperties("app")
	public class GetInfo {
		 
		 private String name;
		 private String description;
		 private String version;

		 public String getName() {
		  return name;
		 }

		public void setName(String name) {
		this.name = name;
		}

		 public String getDescription() {
		  return description;
		 }

		 public void setDescription(String description) {
		  this.description = description;
		 }
		 
		 public String getVersion() {
			  return version;
			 }

			 public void setVersion(String version) {
			  this.version = version;
			 }		 
		}


