package com.thinkconstructive.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest_demo.model.CloudVendor;

/**
 * CloudAPIService
 */
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

  CloudVendor cloudVendor;

  @GetMapping("{vendorId}")
  public CloudVendor getCloudVendorDetails(String vendorID){

    return cloudVendor;

    /*
    // hardcoded pelo exemplo
    return new CloudVendor("C1", "Vendor 1", "Address 1", "xxx");
    */
  }

  @PostMapping
  public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor = cloudVendor;

    return "Cloud Vendor Created Successfuly";
  }

  @PutMapping
  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor = cloudVendor;

    return "Cloud Vendor Updated Successfuly";
  }

  @DeleteMapping("{vendorId}")
  public String deleteCloudVendorDetails(String vendorId){
    this.cloudVendor = null;

    return "Cloud Vendor deleted Successfuly";
  }


  
}
