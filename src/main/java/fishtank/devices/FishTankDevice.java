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
package main.java.fishtank.devices;

public interface FishTankDevice {
	
	public void run();
	
	public boolean isRunning();
	
	public void setIsRunning(boolean value);
	
	public String getID(); // must have no spaces
	
	public String getName();
	
	public String getManufacturer();
	
	public String getModel();
	
	public String getType();
	
	public String getDataArrayString();
	
	@Override
	public String toString();

	public boolean writeToFile();
}
