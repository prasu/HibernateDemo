package org.gcp.hib.MapperExample;

import org.modelmapper.PropertyMap;

public class EventDataMapper extends PropertyMap<Event, EventData> {

	@Override
	protected void configure() {
		
        map().setClient(source.getClientId().getName());
        using(new Converter()).map(source.getEventRelDataList()).setLayerTotalTime(null);
		
	}
}
