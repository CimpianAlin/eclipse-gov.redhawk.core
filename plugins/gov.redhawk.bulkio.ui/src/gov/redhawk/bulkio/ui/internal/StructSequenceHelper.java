/**
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 * 
 * This file is part of REDHAWK IDE.
 * 
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 *
 */
package gov.redhawk.bulkio.ui.internal;

import mil.jpeojtrs.sca.util.AnyUtils;

import org.eclipse.jdt.annotation.NonNull;
import org.omg.CORBA.Any;

import CF.DataType;

public class StructSequenceHelper {
	private String id;
	private Any value;
	private DataType[] dataTypeArray;
	private Object parent;
	private boolean isArray; /*This switch indicates to the program whether 
								the StructSequenceHelper is an array.  
								If not, it is the lowest element in the hierarchy and has no children*/

	public StructSequenceHelper(@NonNull String id, @NonNull Any any, int index, Object parent) {
		if (AnyUtils.convertAny(any) instanceof DataType[]) {
			this.id = id + " [" + index + "]";
			this.dataTypeArray = ((DataType[]) AnyUtils.convertAny(any));
			this.parent = parent;
			setArray(true);
		}
	}

	public StructSequenceHelper(@NonNull String id, @NonNull Any value, Object parentElement) {
		this.setId(id);
		this.setValue(value);
		this.parent = parentElement;
		setArray(false);
	}

	@NonNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NonNull
	public Any getValue() {
		return value;
	}

	public void setValue(Any value) {
		this.value = value;
	}

	@NonNull
	public DataType[] getArray() {
		return dataTypeArray;
	}

	public void setArray(DataType[] elements) {
		this.dataTypeArray = elements;
	}

	public boolean isArray() {
		return isArray;
	}

	public void setArray(boolean isArray) {
		this.isArray = isArray;
	}

	public Object getParent() {
		return parent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("SSH Obj: " + obj);
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof StructSequenceHelper)) {
			return false;
		}
		StructSequenceHelper other = (StructSequenceHelper) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
}
