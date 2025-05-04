package com.loadbalancer;
import com.loadbalancer.models.interfaces.LoadBalancerI;
import com.loadbalancer.services.RoundRobinLoadBalancerService;
public class LoadBalancerApp {
	private static LoadBalancerI loadBalancer;
	
	public static void main(String[] args) {
		loadBalancer = new RoundRobinLoadBalancerService();
		System.out.println("Successfully provisioned a round robin load balancer");
		return;
	}
}
