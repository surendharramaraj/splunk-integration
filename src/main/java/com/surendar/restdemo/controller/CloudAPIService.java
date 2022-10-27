package com.surendar.restdemo.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surendar.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

	private static final Logger logger = LogManager.getLogger(CloudAPIService.class);

	CloudVendor cloudVendor;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		logger.info("Getting vendor details");
		return cloudVendor;
//				new CloudVendor("1","surendar","kovilpatti","xxxx");
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		logger.info("Creating Cloud Vendor");
		this.cloudVendor = cloudVendor;
		return "cloud vendor created successfully";
	}
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		logger.info("updating cloud vendor details");
		this.cloudVendor = cloudVendor;
		return "cloud vendor updated successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId){
		logger.info("Deleting cloudVendor");
		this.cloudVendor = null;
		return "cloud vendor deleted successfully";
	}
}
