/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package resources;

import java.lang.reflect.Type;
import java.util.logging.Logger;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import main.java.fishtank.devices.FishTankDevice;

public class GsonSerializerDevices implements JsonSerializer<FishTankDevice> {

	private static final Logger LOGGER = Logger.getLogger(GsonSerializerDevices.class.getName());
	
	@Override
	public JsonElement serialize(FishTankDevice src, Type typeOfSrc, JsonSerializationContext context) {
		LOGGER.info("Using FishTankDevice serializer");
		
		final JsonObject jsonObj = new JsonObject();
		
		jsonObj.addProperty("id", src.getID());
		jsonObj.addProperty("name", src.getName());
		jsonObj.addProperty("manufacturer", src.getManufacturer());
		jsonObj.addProperty("model", src.getModel());		
		jsonObj.addProperty("type", src.getType());		
		
		return jsonObj;
	}

}