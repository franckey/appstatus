/*
 * Copyright 2010 Capgemini
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 * 
 */
package net.sf.appstatus.agent;

/**
 * Service monitor agent interface.
 * 
 * @author Guillaume Mary
 * 
 */
public interface IServiceMonitorAgent {

	/**
	 * Notify the beginning of a call to a service.
	 * 
	 * @return call id
	 */
	String beginCall();

	/**
	 * Notify the end of a call to a service.
	 * 
	 * @param id
	 *            call id
	 */
	void endCall(String id);
}
