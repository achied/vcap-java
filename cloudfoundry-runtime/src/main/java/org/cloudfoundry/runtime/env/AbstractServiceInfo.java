package org.cloudfoundry.runtime.env;

import java.util.Map;

/**
 * Common service information
 *
 * @author Ramnivas Laddad
 *
 */
public abstract class AbstractServiceInfo {
	private String serviceName;
	private String plan;

	public AbstractServiceInfo(Map<String, Object> serviceInfo) {
		serviceName = (String) serviceInfo.get("name");
		plan = (String) serviceInfo.get("plan");
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getPlan() {
		return plan;
	}

	public abstract String getHost();
	public abstract int getPort();
	public abstract String getPassword();

}
