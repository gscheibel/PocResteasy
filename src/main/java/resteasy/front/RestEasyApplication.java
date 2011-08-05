package resteasy.front;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestEasyApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RestEasyApplication() {
		singletons.add(new DataServices());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
