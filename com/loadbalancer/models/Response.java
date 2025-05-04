package com.loadbalancer.models;
import com.loadbalancer.models.interfaces.*;

public class Response implements ResponseI {
	String responseId;
        public Response(String _responseId) {
		responseId = _responseId;
	}
}
