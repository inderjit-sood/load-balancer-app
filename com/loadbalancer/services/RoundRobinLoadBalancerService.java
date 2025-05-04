package com.loadbalancer.services;

import com.loadbalancer.models.interfaces.*;
import com.loadbalancer.models.*;

public class RoundRobinLoadBalancerService implements LoadBalancerI {
	private BackendSetI backendSet;
	public ResponseI sumbmit(RequestI request){
		return new Response("Yay Lb response");
	}
	public boolean addBackend(BackendI backend) {
		backendSet.addBackend(backend);
		return true;
	}
	public boolean removeBackend(BackendI backend) {
		if(backend.getId() != null && backend.getId() != "" && backendSet.doesContainBackendById(backend.getId())) {
			backendSet.removeBackend(backend);
		}
		return true;
	}
		
	public RoundRobinLoadBalancerService() {
	}
}
