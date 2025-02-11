package org.cryptomator.notify;

import org.cryptomator.integrations.common.IntegrationsLoader;

import java.util.ServiceLoader;
import java.util.stream.Stream;

public interface NotificationHandler {

	Answer handle(Event e);

	static Stream<NotificationHandler> loadAll() {
		return IntegrationsLoader.loadAll(ServiceLoader.load(NotificationHandler.class), NotificationHandler.class);
	}
}
