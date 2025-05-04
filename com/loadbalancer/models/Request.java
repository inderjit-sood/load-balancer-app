package com.loadbalancer.models;
import com.loadbalancer.models.interfaces.*;

public class Request implements RequestI {
	String requestId;
	Request(String _requestId) {
		requestId = _requestId;
	}
}
