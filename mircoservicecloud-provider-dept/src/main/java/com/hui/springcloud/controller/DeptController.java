package com.hui.springcloud.controller;

import com.hui.springcloud.entities.Dept;
import com.hui.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class DeptController
{
	@Autowired
	private DeptService service;
//	@Autowired
//	private DiscoveryClient client;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept)
	{
		return true;
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id)
	{
		return null;
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		List<Dept> result = new ArrayList<>();
		result.add(new Dept("hh"));
		result.add(new Dept("gg"));
		return result;
	}

	
//	@Autowired
//	private DiscoveryClient client;
//	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
//	public Object discovery()
//	{
//		List<String> list = client.getServices();
//		System.out.println("**********" + list);
//
//		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
//		for (ServiceInstance element : srvList) {
//			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
//					+ element.getUri());
//		}
//		return this.client;
//	}

}
