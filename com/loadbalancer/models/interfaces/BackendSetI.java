package com.loadbalancer.models.interfaces;

public interface BackendSetI {
	boolean addBackend(BackendI backend);
	boolean removeBackend(BackendI backend);
	boolean doesContainBackendById(String backendId);
}
